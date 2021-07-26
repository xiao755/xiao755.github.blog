package com.example.myapplication01;

import com.example.myapplication01.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        //author @zx
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());

    }
}
