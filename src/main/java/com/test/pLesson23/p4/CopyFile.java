package com.test.pLesson23.p4;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFile {

    public static void copyFileByIO(File src, File dst) throws IOException {
        try(InputStream inputStream = new FileInputStream(src);
            OutputStream outputStream = new FileOutputStream(dst)){

            byte[] buffer = new byte[4096];
            int length;
            while((length = inputStream.read(buffer)) > 0){
                outputStream.write(buffer, 0, length);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileByChannel(File src, File dst){
        try(FileChannel srcFileChannel  = new FileInputStream(src).getChannel();
            FileChannel dstFileChannel = new FileOutputStream(dst).getChannel()){
            long count = srcFileChannel.size();
            while(count > 0){
                long transferred = srcFileChannel.transferTo(srcFileChannel.position(),
                        count, dstFileChannel);
                srcFileChannel.position(srcFileChannel.position() + transferred);
                count -= transferred;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copyFileByClasFiles(Path srcPath, Path dstPath){
        try {
            Files.copy(srcPath, dstPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        File src = new File("com.study.examples/src/lesson22/p4/java.png");
        File dst = new File("com.study.examples/src/lesson22/p4/javaCopy.png");

        long time = System.currentTimeMillis();
        copyFileByIO(src, dst);
        System.out.println("copyFileByIO - " + (System.currentTimeMillis() - time));

        File dst2 = new File("com.study.examples/src/lesson22/p4/javaCopy2.png");

        time = System.currentTimeMillis();
        copyFileByChannel(src, dst2);
        System.out.println("copyFileByChannel - " + (System.currentTimeMillis() - time));

        Path srcPath = Paths.get("com.study.examples/src/lesson22/p4/java.png");
        Path dstPath = Paths.get("com.study.examples/src/lesson22/p4/dst/javaCopy3.png");

        time = System.currentTimeMillis();
        copyFileByClasFiles(srcPath, dstPath);
        System.out.println("copyFileByClasFiles - " + (System.currentTimeMillis() - time));
    }
}
