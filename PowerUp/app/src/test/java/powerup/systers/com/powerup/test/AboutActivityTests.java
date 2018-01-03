package powerup.systers.com.powerup.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import powerup.systers.com.AboutActivity;

/**
 * Created by Aryaman21 on 02-01-2018.
 */

@RunWith(MockitoJUnitRunner.class)
public class AboutActivityTests {

    @InjectMocks
    AboutActivity aboutActivity = new AboutActivity();

    @Mock
    private AboutActivity aboutActivity1 = Mockito.mock(AboutActivity.class);
    @Mock
    private boolean isAboutGameOpen = false;
    private boolean isAboutUrgencyOpen = false;
    private boolean isAboutHelpingOpen = false;
    private static String isGameOpen = "ABOUT_GAME_OPEN";
    private static String isUrgencyOpen = "ABOUT_URGENCY_OPEN";
    private static String isHelpingOpen = "ABOUT_HELPING_OPEN";


    @Test
    public void testing_text(){
        aboutActivity1.aboutGamePressed(null);
    }

}
