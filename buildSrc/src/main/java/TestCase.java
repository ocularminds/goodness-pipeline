public class TestCase{

	  private String name;
	  private String log;
	  private String component;
      private String[] args;

	public TestCase(){}

	public TestCase(String name, String log, String component,String[] args){
		this.name = name;
		this.log = log;
		this.component = component;
		this.args = args;
	}
}