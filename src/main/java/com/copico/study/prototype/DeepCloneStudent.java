package com.copico.study.prototype;

import lombok.Data;

import java.io.*;

/**
 * @author owen
 */
@Data
public class DeepCloneStudent implements Cloneable, Serializable {
    private int id;

    private String idCard;

    private Class aClass;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
