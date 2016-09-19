package org.tokmak.money;

/**
 * <b>created at</b> Sep 19, 2016 9:48:57 PM
 * 
 * @author Volkan Tokmak
 * @since 0.0.1
 */
public final class Money
{
	private Double amount = null;
	private CurrencyEnum currency = null;

	/**
	 * <b>created at</b> Sep 19, 2016 9:49:06 PM
	 * 
	 * @author Volkan Tokmak
	 * @since 0.0.1
	 */
	public enum CurrencyEnum
	{
		USD, EURO;
	}

	/**
	 * <b>created at</b> Sep 19, 2016 9:49:10 PM
	 * 
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public Money()
	{
		this.amount = Double.valueOf(0f);
		this.currency = CurrencyEnum.EURO;
	}

	/**
	 * @param amount
	 * @param currency
	 *
	 *            <b>created at</b> Sep 19, 2016 9:49:15 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public Money(Double amount, CurrencyEnum currency)
	{
		this.amount = amount;
		this.currency = currency;
	}

	/**
	 * @param factor
	 * @return
	 * 
	 * 		<b>created at</b> Sep 19, 2016 9:49:21 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public Money multiplyBy(int factor)
	{
		this.amount = this.amount * factor;
		return this;
	}

	/**
	 * @return
	 * 
	 * 		<b>created at</b> Sep 19, 2016 9:49:27 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public Double getAmount()
	{
		return this.amount;
	}

	/**
	 * @param amount
	 * 
	 *            <b>created at</b> Sep 19, 2016 9:49:32 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public void setAmount(Double amount)
	{
		this.amount = amount;
	}

	/**
	 * @return
	 * 
	 * 		<b>created at</b> Sep 19, 2016 9:49:37 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public CurrencyEnum getCurrency()
	{
		return this.currency;
	}

	/**
	 * @param currency
	 * 
	 *            <b>created at</b> Sep 19, 2016 9:49:41 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	public void setCurrency(CurrencyEnum currency)
	{
		this.currency = currency;
	}

	/**
	 * @return
	 *
	 * 		<b>created at</b> Sep 19, 2016 9:49:46 PM
	 * @since 0.0.1
	 * @author Volkan Tokmak
	 */
	@Override
	public String toString()
	{
		return "Money: " + this.amount + " " + this.currency.name();
	}
}
