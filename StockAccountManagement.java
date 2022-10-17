package StockAccountManagement;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class StockAccountManagement {

    public List<StockDetails> getStockDetailsFromFile() throws FileNotFoundException {
        Gson gson = new Gson(); //created gson library

        //read json file from file path
        JsonReader reader = new JsonReader(new FileReader("C:/Users/VISHNU VARDHAN REDDY/IdeaProjects/Day 11 and 12/src/StockAccountManagement/Stock/Stock.json"));
        StockDetails[] stockDetails = gson.fromJson(reader, StockDetails[].class); // read data from file path store the date in array
        return Arrays.asList(stockDetails);
    }

    public void printStockReport(List<StockDetails> stockDetailsList) {
        for (StockDetails stockDetails1 : stockDetailsList) {
            System.out.println("stock name: " + stockDetails1.getStockName());
            System.out.println("Number of stock: " + stockDetails1.getNumOfShare());
            System.out.println("stock price: " + stockDetails1.getSharePrice());
            System.out.println("Total Price of Stocks: " + stockDetails1.getSharePrice() * stockDetails1.getNumOfShare());
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        StockAccountManagement stockAccountManagement = new StockAccountManagement();
        stockAccountManagement.printStockReport(stockAccountManagement.getStockDetailsFromFile());
    }
}
