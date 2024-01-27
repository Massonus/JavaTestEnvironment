package org.test.lesson16;

public class Utils {

    public int getResult(final int x, final int y) {
        return x/y;
    }

    public void setUpAccess(final String userName) throws ClassNotFoundException {
        if (userName.equals("Lisa")) {
            System.out.println("Wlcome");
        } else {
            throw new MyEx();
        }
    }

    public int getLength(String str) {

        try {
            return str.length();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        return 0;
    }

    public int getId(final int id) {

        try {
            if (id ==0) {
                return 22;
            }
            System.exit(0);
        } catch (NullPointerException e) {
            System.out.println(e);
        } finally {
            return id;
        }

    }

}
