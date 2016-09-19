package org.tokmak.money;

import org.tokmak.money.Money.CurrencyEnum;

/**
 * <b>created at</b> Sep 19, 2016 9:50:44 PM
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public class Application
{
	/**
	 * @param args
	 * 
	 * <b>created at</b> Sep 19, 2016 9:50:50 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public static void main(String[] args)
	{
		Money euro 	= new Money(67.89, CurrencyEnum.EURO);
		Money usd	= new Money(98.76, CurrencyEnum.USD);
		
		System.out.println(euro);
		System.out.println(euro.multiplyBy(5));
		
		System.out.println("------------------------");
		
		System.out.println(usd);
		System.out.println(usd.multiplyBy(4));
	}
}
