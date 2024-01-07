import java.util.Random;

class Main1 {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        telegram.checkSMSCode(22443,"998916078639");
        //telegram.createAccount();
        telegram.getUserCount();
        telegram.notifyAll();
    }
}

public class Telegram {
    private User[] registeredUsers;
    private User[] unRegisteredUsers;
    private int[] codes;
    private int regIndex;
    private int unRegIndex;
    public Telegram() {
        registeredUsers = new User[10];
        unRegisteredUsers = new User[10];
        codes = new int[10];
    }
    public boolean createAccount(User user) {
        int pos = findUserByIndex(user.getPhoneNumber(), registeredUsers,regIndex);
        int pos2 = findUserByIndex(user.getPhoneNumber(), unRegisteredUsers,unRegIndex);
        if (pos == -1 && pos2 == -1) {
            Random random = new Random();
            int code = random.nextInt(89_999)+10_000;
            if (unRegIndex == unRegisteredUsers.length) resizeUnReg();
            unRegisteredUsers[unRegIndex] = user;
            codes[unRegIndex++]=code;
            System.out.println("sms code -> " + code + "\nfor phoneNumber -> " + user.getPhoneNumber());
            return true;
        }
        return false;
    }
    public void checkSMSCode(int code, String phoneNumber) {
        int pos = findUserByIndex(phoneNumber,unRegisteredUsers,unRegIndex);
        if (pos != -1) {
            if (unRegisteredUsers[pos].getPhoneNumber().equals(phoneNumber)&&codes[pos]==code){
                if (registeredUsers.length==regIndex) resizeReg();
                registeredUsers[regIndex++] = unRegisteredUsers[pos];
                removeUserFromUnregistered(pos);
            }
        }else {
            System.out.println("invalid code for phoneNumber -> "+phoneNumber);
        }
    }
    public int getUserCount() {
        return regIndex;
    }
    public boolean deleteAccount(String phoneNumber) {
        int pos = findUserByIndex(phoneNumber,registeredUsers,regIndex);

        if (pos != -1) {
            removeUserFromRegistered(pos);
            return true;
        }
        return false;
    }
    private int findUserByIndex(String phoneNumber,User[] users,int index) {
        for (int i = 0; i < index; i++) {
            if (users[i].getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }
    private void resizeUnReg() {
        int size =unRegisteredUsers.length+(unRegisteredUsers.length>>1);
        User[] newUnRegUsers = new User[size];
        int[] newCodes = new int[size];

        for (int i = 0; i < unRegisteredUsers.length; i++) {
            newUnRegUsers[i] = unRegisteredUsers[i];
            newCodes[i] = codes[i];
        }
        unRegisteredUsers = newUnRegUsers;
        codes = newCodes;
    }
    private void resizeReg() {
        int size = registeredUsers.length+(registeredUsers.length>>1);
        User[] newRegisteredUsers = new User[size];

        for (int i = 0; i < registeredUsers.length; i++) {
            newRegisteredUsers[i] = registeredUsers[i];
        }
        registeredUsers = newRegisteredUsers;
    }
    private void removeUserFromUnregistered(int pos) {
        unRegIndex--;
        unRegisteredUsers[pos] =unRegisteredUsers[unRegIndex];
        codes[pos] = codes[unRegIndex];
    }
    private void removeUserFromRegistered(int pos) {
        regIndex--;
        registeredUsers[pos] = registeredUsers[regIndex];
    }
    public void showNotRegisterUsers() {
        for (int i = 0; i < unRegIndex; i++) {
            System.out.println(unRegisteredUsers[i].toString());
        }
    }
    public void showUsers() {
        for (int i = 0; i < regIndex; i++) {
            System.out.println(registeredUsers[i].toString());
        }
    }


}
