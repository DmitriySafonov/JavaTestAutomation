public class Shareholders extends WorkerOfCompany{
						private float ShareInShareCapital;
						private float InvestmentsAmountUSD;
						private float StockDevidentsAmountUSD;
				
				private void buyShares(float NewShareInShareCapiral) {ShareInShareCapital=NewShareInShareCapiral;};
				private void investMoney(float InvestedAmountUSD) {InvestmentsAmountUSD+=InvestedAmountUSD;};
				public float getStockDevidentsAmountUSD() {
					return StockDevidentsAmountUSD;
				}
				public void setStockDevidentsAmountUSD(float stockDevidentsAmountUSD) {
					StockDevidentsAmountUSD = stockDevidentsAmountUSD;
				}
				public float getShareInShareCapital() {
					return ShareInShareCapital;
				}
				public float getInvestmentsAmountUSD() {
					return InvestmentsAmountUSD;
				};

}
