import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nim = sc.nextInt();
        int kim = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nim; i++) {
            int xim = sc.nextInt();
            map.put(xim, map.getOrDefault(xim, 0) + 1);
        }
        ArrayList<Integer> anan = new ArrayList<>(map.values());
        Collections.sort(anan);
        int res = anan.size();
        for (int i = 0; i < anan.size(); i++) {
            if (kim >= anan.get(i)) {
                kim -= anan.get(i);
                res--;
            } else {
                break;
            }
        }
        System.out.println(res);
    }
}
