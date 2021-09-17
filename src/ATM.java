/*Pooja would like to withdraw X $US from an ATM.
 The cash machine will only accept the transaction if X is a multiple of 5,
 and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges).
 For each successful withdrawal the bank charges 0.50 $US.
  Calculate Pooja's account balance after an attempted transaction.
  Input
Positive integer 0 < X <= 2000 - the amount of cash which Pooja wishes to withdraw.
Nonnegative number 0<= Y <= 2000 with two digits of precision - Pooja's initial account balance.
 */
public class ATM {
    public static void main(String[] args)
    {
        double amt_to_withdraw=500, account_balance=1000;
        if(amt_to_withdraw>0 && amt_to_withdraw<=2000 && amt_to_withdraw%5==0 && account_balance>0 && amt_to_withdraw+.5<account_balance)
        {
            account_balance=account_balance-amt_to_withdraw-.5;
        }
        System.out.println("Balance : "+account_balance);
    }
}
