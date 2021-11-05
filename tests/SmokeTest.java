package com.tests;

import com.base.BaseClasee;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseClasee {

    @Test
    public void appOpens(){
        String siteTitle = driver.getTitle();
        Assert.assertFalse(siteTitle.isEmpty());

    }

}
