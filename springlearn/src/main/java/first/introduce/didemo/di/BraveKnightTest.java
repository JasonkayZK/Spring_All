package first.introduce.didemo.di;

import first.introduce.entity.Quest;
import first.introduce.entity.impl.BraveKnight;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * @author zk
 * @DATE 19-8-8
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knignt = new BraveKnight(mockQuest);
        knignt.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}
