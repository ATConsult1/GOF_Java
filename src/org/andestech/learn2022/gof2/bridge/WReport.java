package org.andestech.learn2022.gof2.bridge;

public class WReport implements IReport {

	private IReportView rv;
	private IData data;
	public WReport(IReportView rv) {this.rv=rv;}
	
	
	@Override
	public void generateReport(String name) {
	System.out.println("Weekly data ready..");
	data = new Data(); data.setPeriod(7);
	//....
	rv.export(name,data);
		
	}
	
	
	
}
