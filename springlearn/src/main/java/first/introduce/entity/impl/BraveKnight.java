package first.introduce.entity.impl;

import first.introduce.entity.Knight;
import first.introduce.entity.Quest;

/**
 * @author zk
 * @DATE 19-8-8
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}
