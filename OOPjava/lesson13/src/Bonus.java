public class Bonus {
    private int count;

    public Bonus(int count) {
        this.count = count;
    }
    public boolean check(Lid lid) {
        int harf = 0;
        int consonant = 0;
        int sum = 0;
        int sum2 = 0;

        for (int i = 0; i < 8; i++) {
            int c = lid.getCode().toLowerCase().charAt(i);
            if(i <= 3) {
                if (c >= '0' && c <= '9') sum += c - '0';
                else {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o') {
                        harf++;
                    }else consonant++;
                    sum += c-'a'+1;
                }
            }else {
                if (c >= '0' && c <= '9') {
                    sum2 += c-'0';
                }
                else {
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o') {
                        harf++;
                    }else consonant++;
                    sum2 += c-'a'+1;
                }
            }
        }
        if (harf == consonant && sum == sum2 && count > 0) {
            count--;
            return true;
        }
        return false;
    }
}
