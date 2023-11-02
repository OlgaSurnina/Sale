public class Sale {


    public static void main(String[] args) {

        short prise = 600;
        System.out.println("Цена рубашки без скидки " + prise);

        byte count = 1;
        System.out.println("Количество выбранных рубашек " + count);

        byte countSale = 3;
        System.out.println("Kоличество рубашек, которые надо купить, чтобы получить скидку " + countSale);

        int plusCountSale = countSale - (count % countSale);
        System.out.println("Kоличество рубашек, которые надо докупить, чтобы получить скидку " + plusCountSale);

        int countPrise = prise * count;
        System.out.println("Цена выбранных рубашек без скидки " + countPrise);

        int prisePlusCountSale = plusCountSale * prise;
        System.out.println("Сумма рубашек, которые надо докупить до скидки " + prisePlusCountSale);

        double procentSale = 0.4;
        System.out.println("Процент скидки " + procentSale);

        double countPriseSale = (countPrise + prisePlusCountSale) * procentSale;
        System.out.println("Цена всех рубашек со скидкой: " + countPriseSale);

        double priceSale = countPriseSale / (count + countSale);
        System.out.println("Цена одной рубашки со скидкой " + priceSale);

        double moneySaved = (prise * (count + plusCountSale)) - countPriseSale;
        System.out.println("Сэкономленные деньги " + moneySaved);

        double countFree = moneySaved / prise;
        System.out.println("Количество рубашек на халяву " + countFree);
    }
}
