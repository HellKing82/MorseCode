package MorseCode;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class testClass {

    private MorseCode.Logic _logic;

    public testClass() {
        _logic = new Logic();
    }

    @Test

    public void OutPrintMorse() {

        String testData = "a";
        String expected = ".- ";
        String actual = _logic.getMorseCode(testData);

        Assert.assertEquals(expected, actual);

    }

    @Test

    public void outPrintEnglish() {

        String testData = ".----";
        String expected = "1";
        String actual = _logic.getMorseCode(testData);

        Assert.assertEquals(expected, actual);
    }

    @Test

    public void downToWord() {

        String testData = "HELLO";
        String expected = "hello";

        String actual = _logic.GetSmallText(testData);

        assertEquals(expected, actual);
    }

    @Test

    public void isLetter() {

        String testData = " ";
        String expected = " ";

        String actual = _logic.GetIsLetter(testData);

        assertEquals(expected, actual);

    }
}


