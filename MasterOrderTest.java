package cookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MasterOrderTest {

    @Test
    public void testFor1Box() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Variety", 1);
        underTest.addOrder(cookieOrderTest);
        int checkBoxes = underTest.getTotalBoxes();

        assertEquals(1, checkBoxes);

    }

    @Test
    public void testFor2Boxes() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Variety", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("Variety", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        int checkBoxes = underTest.getTotalBoxes();

        assertEquals(2, checkBoxes);
    }

    @Test
    public void testFor3Boxes() {
        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Variety", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("Variety", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("Variety", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        int checkBoxes = underTest.getTotalBoxes();

        assertEquals(3, checkBoxes);
    }

    @Test
    public void shouldReturnTotalBoxes1afterRemoval() {

        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("Samoas", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("Lemon", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        underTest.removeVariety("Samoas");
        int checkBoxes = underTest.getTotalBoxes();

        assertEquals(2, checkBoxes);
    }

    @Test
    public void shouldReturnTotalBoxesWithMultipleOrdersSameVarietyAs1afterRemovalOfAll() {

        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("Samoas", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder(cookieOrderTest2);
        underTest.addOrder(cookieOrderTest3);
        underTest.removeVariety("Thin Mints");
        int checkBoxes = underTest.getTotalBoxes();

        assertEquals(1, checkBoxes);
    }

    @Test
    public void shouldReturnTotalOf2BoxesForThinMints() {

        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest2 = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("Samoas", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder((cookieOrderTest2));
        underTest.addOrder((cookieOrderTest3));
        int checkBoxes = underTest.getVarietyBoxes1("Thin Mints");
        assertEquals(2, checkBoxes);
    }

    @Test
    public void shouldReturnTotalOf3BoxesForThinMints() {

        MasterOrder underTest = new MasterOrder();
        CookieOrder cookieOrderTest = new CookieOrder("Thin Mints", 2);
        CookieOrder cookieOrderTest2 = new CookieOrder("Thin Mints", 1);
        CookieOrder cookieOrderTest3 = new CookieOrder("Samoas", 1);
        underTest.addOrder(cookieOrderTest);
        underTest.addOrder((cookieOrderTest2));
        underTest.addOrder((cookieOrderTest3));
        int checkBoxes = underTest.getVarietyBoxes1("Thin Mints");
        assertEquals(3, checkBoxes);
    }
}

