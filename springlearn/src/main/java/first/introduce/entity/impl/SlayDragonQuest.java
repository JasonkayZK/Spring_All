package first.introduce.entity.impl;

import first.introduce.entity.Quest;

import java.io.PrintStream;

/**
 * @author zk
 * @DATE 19-8-8
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon!");
    }
}
