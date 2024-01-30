package com.test.pLesson25.serializable.p4exteralizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class CellPhone implements Externalizable {
    private int id;
    private transient String model;

    static long age;

    public CellPhone() {
    }

    public CellPhone(int id, String model) {
        this.id = id;
        this.model = model;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(model);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id = in.readInt();
        model = (String) in.readObject();
    }

    @Override
    public String toString() {
        return "CellPhone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

}
