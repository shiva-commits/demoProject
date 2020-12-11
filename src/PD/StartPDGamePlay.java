 //package pokerdangal;
package PD;
import au.com.bytecode.opencsv.CSVReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StartPDGamePlay {

    private List<String[]> users;

    @Before
    public void setUp() throws MalformedURLException {
        users = readUsersFromCSV("pduserdata.csv");
    }

    @After
    public void tearDown() {

    }

    @Test
    public void pDGamePlay() {
    	long count = 1;
        for (String[] userAttribute : users) {
            Thread thread = new Thread(new PDThread(userAttribute, count));
            thread.start();
            count++ ;
        }

        while (true) {
            try {
                Thread.sleep(1000);
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    private List<String[]> readUsersFromCSV(String fileName) {
        List<String[]> users = new ArrayList<>();
        try {
            Iterator<String[]> clientSettingsIterator1 = new CSVReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream( fileName)), ',').readAll().iterator();
            clientSettingsIterator1.next();
            while (clientSettingsIterator1.hasNext()) {
                String[] entry = clientSettingsIterator1.next();
                //System.out.println("attributes >> " + entry);
                users.add(entry);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }
}
