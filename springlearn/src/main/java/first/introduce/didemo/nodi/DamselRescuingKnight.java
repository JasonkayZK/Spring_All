package first.introduce.didemo.nodi;

/**
 * @author zk
 * @DATE 19-8-8
 */
public class DamselRescuingKnight {

    private DamselRescuingQuest quest;

    public DamselRescuingKnight() {
        this.quest = new DamselRescuingQuest();
    }

    public void embarkOnQuest() {
        quest.embark();
    }

}
