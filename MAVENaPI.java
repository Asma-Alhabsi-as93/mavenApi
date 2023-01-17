import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import com.google.gson.Gson;

public class MAVENaPI {
	Name name;
	String[]tld;
	String cca2;
	int id;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String[] getTld() {
		return tld;
	}

	public void setTld(String[] tld) {
		this.tld = tld;
	}

	public String getCca2() {
		return cca2;
	}

	public void setCca2(String cca2) {
		this.cca2 = cca2;
	}

	public String getCcn3() {
		return ccn3;
	}

	public void setCcn3(String ccn3) {
		this.ccn3 = ccn3;
	}

	public String getCca3() {
		return cca3;
	}

	public void setCca3(String cca3) {
		this.cca3 = cca3;
	}

	public String getCioc() {
		return cioc;
	}

	public void setCioc(String cioc) {
		this.cioc = cioc;
	}

	public boolean isIndependent() {
		return independent;
	}

	public void setIndependent(boolean independent) {
		this.independent = independent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isUnMember() {
		return unMember;
	}

	public void setUnMember(boolean unMember) {
		this.unMember = unMember;
	}

	public currencies getCurrencies() {
		return currencies;
	}

	public void setCurrencies(currencies currencies) {
		this.currencies = currencies;
	}

	public idd getIdd() {
		return idd;
	}

	public void setIdd(idd idd) {
		this.idd = idd;
	}

	public String[] getCapital() {
		return capital;
	}

	public void setCapital(String[] capital) {
		this.capital = capital;
	}

	public String[] getAltSpellings() {
		return altSpellings;
	}

	public void setAltSpellings(String[] altSpellings) {
		this.altSpellings = altSpellings;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getSubregion() {
		return subregion;
	}

	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}

	public translations getTranslations() {
		return translations;
	}

	public void setTranslations(translations translations) {
		this.translations = translations;
	}

	public float[] getLatlng() {
		return latlng;
	}

	public void setLatlng(float[] latlng) {
		this.latlng = latlng;
	}

	public boolean isLandlocked() {
		return landlocked;
	}

	public void setLandlocked(boolean landlocked) {
		this.landlocked = landlocked;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public demonyms getDemonyms() {
		return demonyms;
	}

	public void setDemonyms(demonyms demonyms) {
		this.demonyms = demonyms;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public maps getMaps() {
		return maps;
	}

	public void setMaps(maps maps) {
		this.maps = maps;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getFifa() {
		return fifa;
	}

	public void setFifa(String fifa) {
		this.fifa = fifa;
	}

	public car getCar() {
		return car;
	}

	public void setCar(car car) {
		this.car = car;
	}

	public String[] getTimezones() {
		return timezones;
	}

	public void setTimezones(String[] timezones) {
		this.timezones = timezones;
	}

	public String[] getContinents() {
		return continents;
	}

	public void setContinents(String[] continents) {
		this.continents = continents;
	}

	public flags getFlags() {
		return flags;
	}

	public void setFlags(flags flags) {
		this.flags = flags;
	}

	public coatOfArms getCoatOfArms() {
		return coatOfArms;
	}

	public void setCoatOfArms(coatOfArms coatOfArms) {
		this.coatOfArms = coatOfArms;
	}

	public String getStartOfWeek() {
		return startOfWeek;
	}

	public void setStartOfWeek(String startOfWeek) {
		this.startOfWeek = startOfWeek;
	}

	public capitalInfo getCapitalInfo() {
		return capitalInfo;
	}

	public void setCapitalInfo(capitalInfo capitalInfo) {
		this.capitalInfo = capitalInfo;
	}

	public msa getMsa() {
		return msa;
	}

	public void setMsa(msa msa) {
		this.msa = msa;
	}

	public String[] getBorders() {
		return borders;
	}

	public void setBorders(String[] borders) {
		this.borders = borders;
	}

	public gini getGini() {
		return gini;
	}

	public void setGini(gini gini) {
		this.gini = gini;
	}

	public postalCode getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(postalCode postalCode) {
		this.postalCode = postalCode;
	}

	String ccn3;
	String cca3;
	String cioc;
	boolean independent;
	String status;
	boolean unMember;
	currencies currencies;
	idd idd;
	String[]capital;
	String[]altSpellings;
	String region;
	String subregion;
	translations translations;
	float[] latlng;
	boolean landlocked;
	float area;
	demonyms demonyms;
	String flag;
	maps maps;
	 long population;
	String  fifa;
	car car;
	String[] timezones;
	String []continents;
	flags flags;
	coatOfArms coatOfArms;
	String startOfWeek;
	capitalInfo capitalInfo;
	msa msa;
	String[] borders;
	gini gini;
	postalCode postalCode;
	
	public static void insertIntoTable() throws IOException, InterruptedException {
	
	String url = "jdbc:mysql://localhost:3306/MavenGson";
	String username = "root";
	String password = "root";
	 String jsonUrl = "http://universities.hipolabs.com/search?country=United+States";
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create(jsonUrl))
	                .build();
	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//	        System.out.println(response.body());
	        Gson gson = new Gson();
	        MAVENaPI[] apiResults =gson.fromJson(response.body(), MAVENaPI[].class);
	        for(MAVENaPI x: apiResults) {
	        	System.out.println("**********************************");
	        	 System.out.print("ID: " + x.getId());
	        	System.out.println("ccn3 is"+x.getCcn3());
	        	System.out.println("independent is"+x.isIndependent());
	        	System.out.println("status is"+x.getStatus());
	        	System.out.println("population is"+x.getPopulation());
	        	System.out.println("startOfWeek is"+x.getStartOfWeek());
	        	
	        	System.out.println("**********************************");
	        }
	        for(MAVENaPI x: apiResults) {
		        String sqlInsert = "insert into MavenGson(ccn3,independent, status,population, startOfWeek,)"
				        + " values('" + x.getCcn3() + "' ,'" + x.isIndependent() + "', '" + x.getStatus() + "','" + x.getPopulation() + "' ,' "
				        + x.getStartOfWeek() + "')";
				        // Connection class object
				        Connection ccon = null;
				        // Try block to check for exceptions
				        try {
				        Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
				        DriverManager.registerDriver(driver);
				        ccon = DriverManager.getConnection(url, username, password);
				        // Creating a statement
				        java.sql.Statement st = ccon.createStatement();
						
				        // Executing query
				        int s = st.executeUpdate(sqlInsert);
				        if (s >= 1)
				        System.out.println("inserted successfully : " + sqlInsert);
				        else
				        System.out.println("insertion failed");
				        // Closing the connections
				        ccon.close();
				        }
				        // Catch block to handle exceptions
				        catch (Exception ex) {
				        // Display message when exceptions occurs
				        System.err.println(ex);
				        }
		        }
	}
	 
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
			
			Scanner sc = new Scanner(System.in);
			boolean hasExit = true;
			do {
				
				System.out.println("*****************");
				System.out.println("1:create table");
				System.out.println("2:Insert  ");
				
				System.out.println("*******************");
				
				int select = sc.nextInt();

				switch (select) {
				case 1:
					insertIntoTable();
					break;
					
				case 2:
					break;
					
				case 3:
					break;
				}
			} while (hasExit);
				}
//			

}

