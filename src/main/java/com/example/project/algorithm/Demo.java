package com.example.project.algorithm;

import com.example.project.entity.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo {

    public static Address calAddress() {

        File file = new File("E:\\words.txt");
        Bank bank =  new Bank();
        Details details = new Details();
        From from = new From();
        Invoice invoice = new Invoice();
        Page page = new Page();
        To to = new To();
        Total total = new Total();
        Address address = new Address(invoice,page,bank,details,from,to,total);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String string = scanner.nextLine();
                if(string.contains("From:")){
                        from.setName(string.trim().substring(5).trim());
                        from.setSuite(scanner.nextLine().trim());
                        from.setAddress1(scanner.nextLine().trim());
                        from.setAddress2(scanner.nextLine().trim());
                        from.setEmail(scanner.nextLine().trim());
                }
                else if(string.contains("To:")){
                    to.setName(string.trim().substring(3).trim());
                    to.setAddress1(scanner.nextLine().trim());
                    to.setAddress2(scanner.nextLine().trim());
                    to.setEmail(scanner.nextLine().trim());
                }
                else if(string.contains("Invoice Number")){
                     invoice.setInvoiceNumber(string.trim().substring(14).trim());
                }
                else if(string.contains("Order Number")){
                     invoice.setOrderNumber(string.trim().substring(12).trim());
                }
                else if(string.contains("Invoice Date")){
                    invoice.setInvoiceDate(string.trim().substring(12).trim());
                }else if(string.contains("Due Date")){
                    invoice.setDueDate(string.trim().substring(8).trim());
                }else if(string.contains("Total Due")){
                    invoice.setTotalDue(string.trim().substring(9).trim());
                }else if(string.contains("Hrs/Qty")){
                    details.setHrsPerQty(string.trim().substring(7).trim());
                }else if(string.contains("Service")){
                    details.setService(string.trim().substring(7).trim());
                }else if(string.contains("Rate/Price")){
                    details.setRatePerPrice(string.trim().substring(10).trim());
                }else if(string.contains("Adjust")){
                    details.setAdjust(string.trim().substring(6).trim());
                }else if(string.contains("Sub Total")){
                    System.out.println(string);
                    details.setSubtotal(string.trim().substring(9).trim());
                    total.setSubtotal(string.trim().substring(9).trim());
                }else if(string.contains("Tax")){
                    total.setTax(string.trim().substring(3).trim());
                }else if(string.contains("Total $")){
                    total.setTotal(string.trim().substring(7).trim());
                }
                else if(string.contains("Bank")){
                    String end = string.trim();
                    bank.setName(end.substring(0,end.length()-4).trim());
                }else if(string.contains("ACC")){
                    bank.setAcc(string.trim().substring(3).trim());
                }else if(string.contains("BSB")){
                    bank.setBsb(string.trim().substring(3).trim());
                }else if(string.contains("Thanks")){
                    address.setNote(string.trim());
                }else if(string.contains("Late payment")){
                    address.setRemark(string.trim());
                }else if(string.contains("Page")){
                    String str= string.trim().substring(4).trim();
                    page.setCurrent(str.substring(0,str.indexOf("/")));
                    page.setTotal(str.substring(str.indexOf("/")+1));
                }
            }
            scanner.close();
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return address;
    }

}
