package com.plato.live255.utils;

import java.text.Collator;
import java.util.Comparator;

import com.plato.mcs.OrgProfileActivity.ContactInfo;

public class SortComparatorUtils implements Comparator<Object> {

    @Override
    public int compare(Object arg0, Object arg1) {
        Collator collator = Collator.getInstance(java.util.Locale.CHINA);
        ContactInfo info1 = (ContactInfo)arg0;
        ContactInfo info2 = (ContactInfo)arg1;

        if (collator.compare(info1.mLetter, info2.mLetter) < 0) {
            return -1;
        } else if (collator.compare(info1.mLetter, info2.mLetter) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
