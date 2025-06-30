package RaceCondition;

public class customScope extends Thread {

	private Resource resource;

	public customScope(Resource resource) {
		this.resource=resource;
	}
		@Override
		public void run() {
			String name=Thread.currentThread().getName();
			for(int i=0;i<10;i++) {
				
				//resource.printer1(name);
				resource.printer4(name);
			}
		}
}
