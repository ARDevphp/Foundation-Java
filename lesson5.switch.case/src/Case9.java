public class Case9 {
    public static void main(String[] args) {
        function(28,2);
        function(29,2);
        function(27,2);
        function(30,12);
        function(31,12);
        function(32,12);
        function(31,3);
        function(30,6);
        function(7,6);
        function(7,8);
        function(31,8);

    }
    public static void function(int day, int month) {
        int count = 1;
        if (!(day >= 1 && day <= 31)) {
            System.out.println("Bunday kun yo'q");
        }
        if (!(month >= 1 && month <= 12)) {
            System.out.println("Bunday oy yo'q");
        }
        else {
            switch (month) {
                case 1: {
                    if (day<=30) {
                        day++;
                        System.out.println(day + "-Yanvar");
                    } else if (day == 31) {
                        System.out.println(count + "-Fevral");
                    }
                    break;
                }
                case 2: {
                    if (day <= 27) {
                        day++;
                        System.out.println(day + "-Fevral");
                    } else if (day == 28) {
                        System.out.println(count + "-Mart");
                    } else {
                        System.out.println("Bunday kun yo'q");
                    }
                    break;
                }
                case 3: {
                    if (day <= 30) {
                        day++;
                        System.out.println(day + "-Mart");
                    }else if (day == 31) {
                        System.out.println(count + "-Aprel");
                    }
                    break;
                }
                case 5: {
                    if (day <= 30) {
                        day++;
                        System.out.println(day + "-May");
                    }else if (day == 31) {
                        System.out.println(count + "-Iyun");
                    }
                    break;
                }
                case 7:{
                    if (day <= 30) {
                        day++;
                        System.out.println(day + "-Iyul");
                    }else if (day == 31) {
                        System.out.println(count + "-Avgust");
                    }
                    break;
                }
                case 8:{
                    if (day <= 30) {
                        day++;
                        System.out.println(day + "-Avgust");
                    }else if (day == 31) {
                        System.out.println(count + "-Sentabr");
                    }
                    break;
                }
                case 10: {
                    if (day <= 30) {
                        day++;
                        System.out.println(day + "-Oktabr");
                    }else if (day == 31) {
                        System.out.println(count + "-Nayabr");
                    }
                    break;
                }
                case 12:{
                    if (day <= 30) {
                        day++;
                        System.out.println(day + "-Dekabr");
                    }else if (day == 31) {
                        System.out.println(count + "-Yanvar");
                    }
                    break;
                }
                case 4: {
                    if (day <= 29) {
                        day++;
                        System.out.println(day + "-Aprel");
                    } else if (day == 30) {
                        System.out.println(count + "-May");
                    }
                    break;
                }
                case 6: {
                    if (day <= 29) {
                        day++;
                        System.out.println(day + "-Iyun");
                    } else if (day == 30) {
                        System.out.println(count + "-Iyul");
                    }
                    break;
                }
                case 9: {
                    if (day <= 29) {
                        day++;
                        System.out.println(day + "-Sentabr");
                    } else if (day == 30) {
                        System.out.println(count + "-Oktabr");
                    }
                    break;
                }
                case 11: {
                    if (day <= 29) {
                        day++;
                        System.out.println(day + "-Nayabr");
                    } else if (day == 30) {
                        System.out.println(count + "-Dekabr");
                    }
                    break;
                }
            }
        }
    }
}
