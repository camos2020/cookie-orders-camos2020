package cookies;
import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

    private Object ArrayList;
    List<CookieOrder> orders = new ArrayList<>();

    public void addOrder(CookieOrder cookieOrder) {
        orders.add(cookieOrder);
    }

    public int getTotalBoxes() {
        int boxes = 0;
        for (CookieOrder order : orders) {
            boxes += order.getNumBoxes();
        }
        return boxes;
    }


    public void removeVariety(String variety) {
        //
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (orders.get(i).getVarietyName().equals(variety)) {
                orders.remove(i);
            }
        }
    }

//    public int getVarietyBoxes1(String varietyName) {
//        return 0;
//}

    public int getVarietyBoxes1(String varietyName) {
        String getVarietyName;
        int countVarBoxes = 0;
        for (CookieOrder order : orders) {
            if (order.getVarietyName().equals(varietyName)) {
                countVarBoxes += order.getNumBoxes();
            }
        }
        return countVarBoxes;
    }


    public void showOrder() {

        for (CookieOrder order : orders) {
            System.out.println("Variety: " + order.getVarietyName() + " Boxes: " + order.getNumBoxes());
            {
            }
        }
    }
}



