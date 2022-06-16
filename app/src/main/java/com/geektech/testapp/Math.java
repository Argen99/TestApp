package com.geektech.testapp;

public class Math {


    public String divide(String a, String b) {
        String result;

        if (isNumeric(a) && isNumeric(b)) {
            double dNum1 = Double.parseDouble(a);
            double dNum2 = Double.parseDouble(b);
            if (dNum1 == java.lang.Math.ceil(dNum1) && dNum2 == java.lang.Math.ceil(dNum2)){
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                if (num2 == 0){
                    result = "На 0 делить нельзя";
                }else {
                    result = String.valueOf(num1 / num2);
                }
            }else {
                result = "Дробные числа нельзя";
            }
        }else {
            result = "Буквы нельзя";
        }
        return result;
    }

    public String add(String a, String b) {
        String result;
        if (a == null || b == null) {
            result = "Введите число";
        } else if (a.contains(" ") || b.contains(" ")) {
            result = "Пробелы нельзя";
        } else if (isNumeric(a) && isNumeric(b)) {
            double x = Double.parseDouble(a);
            double z = Double.parseDouble(b);
            if (x == java.lang.Math.ceil(x) && z == java.lang.Math.ceil(z)) {
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                if (num1 < 0 || num2 < 0) {
                    result = "Отрицательные числа нельзя";
                } else {
                    result = String.valueOf(num1 + num2);
                }
            } else {
                result = "Дробные числа нельзя";
            }
        } else {
            result = "Буквы нельзя";
        }
        return result;
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
