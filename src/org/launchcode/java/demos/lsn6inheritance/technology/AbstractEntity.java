package org.launchcode.java.demos.lsn6inheritance.technology;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {

    private int Id;

    public AbstractEntity() {
        this.Id = ThreadLocalRandom.current().nextInt(0, 100 +1);
    }

    public int getId() {
        return this.Id;
    }
}
