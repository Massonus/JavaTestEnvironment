package org.test.pLesson29;

import java.util.ArrayList;
import java.util.List;

public class Repo {

    private final List<Tea> teaList = new ArrayList<>();

    public List<Tea> getTeaList(int size) {
        for (int i = 0; i < size; i++) {
            Company company = new Company(i, "Home Company" + i);

            Tea tea;

            if (i % 2 == 0) {
                tea = new Tea(i, "Good tea" + i, Type.BLACK, company);
            } else {
                tea = new Tea(i, "Super tea" + i, Type.GREEN, company);
            }

            teaList.add(tea);
        }

        return teaList;
    }

    public List<List<Tea>> getListOfListTeas() {
        final List<List<Tea>> listList = new ArrayList<>();

        List<Tea> teaList1 = new ArrayList<>();

        for (int i = 1; i < 9; i++) {
            teaList1 = getTeaList(i);
        }

        listList.add(teaList1);

        return listList;
    }

}
