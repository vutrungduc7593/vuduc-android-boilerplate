package com.vuduc.android.boilerplate.ui.main;

import java.util.List;

import com.vuduc.android.boilerplate.data.model.Ribot;
import com.vuduc.android.boilerplate.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
