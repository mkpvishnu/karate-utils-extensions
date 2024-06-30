package com.karateext;

import com.intuit.karate.core.ScenarioEngine;
import com.karateext.string.StringUtils;
import com.intuit.karate.core.AutoDef;
import java.util.Map;
import java.lang.annotation.Annotation;
import java.util.HashMap;

public class KarateUtilsPlugin implements AutoDef {

    private static final Map<String, Object> utils;

    static {
        utils = new HashMap<>();
        utils.put("string", new StringUtils());

    }

    public boolean isContextVariable() {
        return true;
    }

    public Object get(ScenarioEngine engine) {
        return utils;
    }

   public String getVariableName() {
        return "utils";
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'annotationType'");
    }
}