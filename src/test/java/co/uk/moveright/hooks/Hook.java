package co.uk.moveright.hooks;

import co.uk.moveright.commons.BrowerClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook extends BrowerClass {

@Before
    public void setup(){launchbrowser("chrome");}
    @After
    public void tearDown() { closeBrower();}

}
