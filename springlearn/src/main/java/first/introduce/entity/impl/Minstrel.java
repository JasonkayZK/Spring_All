package first.introduce.entity.impl;

import java.io.PrintStream;

/**
 * @author zk
 * @DATE 19-8-8
 */

public class Minstrel {

    private PrintStream stream;

    public Minstrel (PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("Sing before quest!");
    }

    public void singAfterQuest() {
        stream.println("Did embark on a quest!");
    }

}
