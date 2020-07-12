package study.ex03;

import java.util.*;

public class CoinExample {

	public static void main(String[] args) {
		Stack<Coin> coinbox = new Stack<Coin>();
		
		coinbox.push(new Coin(100));
		coinbox.push(new Coin(500));
		coinbox.push(new Coin(1000));
		coinbox.push(new Coin(10));
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("������ ���� : " + coin.getValue() +"��");
		}
		

	}

}
