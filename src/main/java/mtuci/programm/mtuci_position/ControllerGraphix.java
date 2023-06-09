package mtuci.programm.mtuci_position;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import mtuci.programm.mtuci_position.Model.Model;

import java.util.ArrayList;

public class ControllerGraphix {
    @FXML
    private Button exit;
    @FXML
    private TableView<Model> tableEduc_Activ;
    @FXML
    private TableView<Model> tablePosition;
    @FXML
    private TableView<Model> tableResrch_Activ;
    @FXML
    private TableView<Model> tableInter_Act;
    @FXML
    private TableView<Model> tableFInance_and_Economic;
    @FXML
    private TableView<Model> tableInfrastract;
    @FXML
    private TableView<Model> tablePersonel;
    @FXML
    private TableView<Model> tableUGNS;
    @FXML
    private TableView<Model> tableAddit_Educ_Act;
    @FXML
    private TableView<Model> tableAddit_research_activities;
    @FXML
    private TableView<Model> tableAddition_personnel;
    @FXML
    private TableView<Model> tableAddition_international_activities;
    @FXML
    private TableView<Model> tableAddition_infrastructure;
    @FXML
    private TableView<Model> tableAddition_financial_and_economic_activity;
    @FXML
    private TableColumn<Model, String> indicator;
    @FXML
    private TableColumn<Model, Double> year2018;
    @FXML
    private TableColumn<Model, Double> year2019;
    @FXML
    private TableColumn<Model, Double> year2020;
    @FXML
    private TableColumn<Model, Double> year2021;
    @FXML
    private TableColumn<Model, Double> year2022;
    @FXML
    private TableColumn<Model, Double> medialValueRF;
    @FXML
    private TableColumn<Model, Double> medialSubject;
    @FXML
    private TableColumn<Model, Double> medialDepartment;
    @FXML
    private TableColumn<Model, Double> f1;
    @FXML
    private TableColumn<Model, Double> f2;
    @FXML
    private TableColumn<Model, Double> f3;
    @FXML
    private TableColumn<Model, Double> f4;
    @FXML
    private TableColumn<Model, Double> f5;
    @FXML
    private TableColumn<Model, Double> f6;
    @FXML
    private TableColumn<Model, Double> f7;
    @FXML
    private TableColumn<Model, Double> f8;
    @FXML
    private TableColumn<Model, Double> f9;
    @FXML
    private TableColumn<Model, Double> f10;
    @FXML
    private TableColumn<Model, Double> f11;
    @FXML
    private TableColumn<Model, Double> f12;
    @FXML
    private TableColumn<Model, Double> f13;
    @FXML
    private TableColumn<Model, Double> f14;
    @FXML
    private TableColumn<Model, Double> f15;


    @FXML
    private TableColumn<Model, Double> b1;
    @FXML
    private TableColumn<Model, Double> b2;
    @FXML
    private TableColumn<Model, Double> b3;
    @FXML
    private TableColumn<Model, Double> b4;
    @FXML
    private TableColumn<Model, Double> b5;
    @FXML
    private TableColumn<Model, Double> b6;
    @FXML
    private TableColumn<Model, Double> b7;
    @FXML
    private TableColumn<Model, Double> b8;
    @FXML
    private TableColumn<Model, Double> b9;
    @FXML
    private TableColumn<Model, Double> b10;
    @FXML
    private TableColumn<Model, Double> b11;
    @FXML
    private TableColumn<Model, Double> b12;
    @FXML
    private TableColumn<Model, Double> b13;
    @FXML
    private TableColumn<Model, Double> b14;
    @FXML
    private TableColumn<Model, Double> b15;

    @FXML
    private TableColumn<Model, Double> b16;

    @FXML
    private TableColumn<Model, Double> d1;
    @FXML
    private TableColumn<Model, Double> d2;
    @FXML
    private TableColumn<Model, Double> d3;
    @FXML
    private TableColumn<Model, Double> d4;
    @FXML
    private TableColumn<Model, Double> d5;
    @FXML
    private TableColumn<Model, Double> d6;
    @FXML
    private TableColumn<Model, Double> d7;
    @FXML
    private TableColumn<Model, Double> d8;
    @FXML
    private TableColumn<Model, Double> d9;
    @FXML
    private TableColumn<Model, Double> d10;
    @FXML
    private TableColumn<Model, Double> d11;
    @FXML
    private TableColumn<Model, Double> d12;
    @FXML
    private TableColumn<Model, Double> d13;

    @FXML
    private TableColumn<Model, Double> IncomeEducationalOrganization;
    @FXML
    private TableColumn<Model, Double> IncomeGeneratingActivities;
    @FXML
    private TableColumn<Model, Double> averageSalaryNPR;
    @FXML
    private TableColumn<Model, Double> incomOrganization;
    @FXML
    private TableColumn<Model, Double> c1;
    @FXML
    private TableColumn<Model, Double> c2;
    @FXML
    private TableColumn<Model, Double> c3;
    @FXML
    private TableColumn<Model, Double> c4;
    @FXML
    private TableColumn<Model, Double> c5;
    @FXML
    private TableColumn<Model, Double> c6;
    @FXML
    private TableColumn<Model, Double> c7;
    @FXML
    private TableColumn<Model, Double> c8;
    @FXML
    private TableColumn<Model, Double> a1;
    @FXML
    private TableColumn<Model, Double> a2;
    @FXML
    private TableColumn<Model, Double> a3;
    @FXML
    private TableColumn<Model, Double> a4;
    @FXML
    private TableColumn<Model, Double> a5;
    @FXML
    private TableColumn<Model, Double>nameUgns;
    @FXML
    private TableColumn<Model, Double>shareStud;
    @FXML
    private TableColumn<Model, Double>shareUgnsFromTotalStud;
    @FXML
    private TableColumn<Model, Double>shareFromTotalStud;
    @FXML
    private TableColumn<Model, Double>numberUniverImplEducation;
    @FXML
    private TableColumn<Model, Double>numberOfBranches;
    @FXML
    private TableColumn<Model, Double>students_enrolled_in_bachelo;
    @FXML
    private TableColumn<Model, Double>includingFullTimeEducation;
    @FXML
    private TableColumn<Model, Double>fullTimeEvening;
    @FXML
    private TableColumn<Model, Double>correspondence_education;
    @FXML
    private TableColumn<Model, Double>AverageScoreExam;
    @FXML
    private TableColumn<Model, Double>proportionStudentsBachelor;
    @FXML
    private TableColumn<Model, Double>n_the_total;
    @FXML
    private TableColumn<Model, Double>share_of_students_enrolled_in_master;
    @FXML
    private TableColumn<Model, Double>totalNumberStudentsAdditional;
    @FXML
    private TableColumn<Model, Double>totalNumberStudentsEnrolledSecondaryVocational;
    @FXML
    private TableColumn<Model, Double>numberEnterprisesContracts;
    @FXML
    private TableColumn<Model, Double>numberEnterprisesContractsBasesPractice;
    @FXML
    private TableColumn<Model, Double>amountFundsReceived;
    @FXML
    private TableColumn<Model, Double>fundsPerformanceWorks;
    @FXML
    private TableColumn<Model, Double>totalNumberPublications;
    @FXML
    private TableColumn<Model, Double>NumberBusinessIncubators;
    @FXML
    private TableColumn<Model, Double>NumberTechnoparks;
    @FXML
    private TableColumn<Model, Double>NumberCentersScientific;
    @FXML
    private TableColumn<Model, Double>NumberSmallEnterprises;
    @FXML
    private TableColumn<Model, Double>NumberGraduateStudents;
    @FXML
    private TableColumn<Model, Double>PercentagePostgraduates;
    @FXML
    private TableColumn<Model, Double>numberDoctoral;
    @FXML
    private TableColumn<Model, Double>NumberDissertation;

    @FXML
    private TableColumn<Model, Double>totalNumberEmployees;
    @FXML
    private TableColumn<Model, Double>TotalNumberTeaching;
    @FXML
    private TableColumn<Model, Double>TotalNumberResearchers;
    @FXML
    private TableColumn<Model, Double>PercentageTeachingStaff;
    @FXML
    private TableColumn<Model, Double>researchersWithAcademic;
    @FXML
    private TableColumn<Model, Double>PercentageTeachingStaffThan65Years;
    @FXML
    private TableColumn<Model, Double>PercentageTeachingStaffThan40Years;
    @FXML
    private TableColumn<Model, Double>AverageSalaryTeaching;
    @FXML
    private TableColumn<Model, Double>AverageSalaryResearchers;
    @FXML
    private TableColumn<Model, Double>studentsEnrolledBachelor;
    @FXML
    private TableColumn<Model, Double>foreignStudents;
    @FXML
    private TableColumn<Model, Double>higherEducation;
    @FXML
    private TableColumn<Model, Double>obtainingTwoDiplomas;
    @FXML
    private TableColumn<Model, Double>foreignGraduateStudents;
    @FXML
    private TableColumn<Model, Double>jointlyWithForeignOrganizations;
    @FXML
    private TableColumn<Model, Double>IncomeForeignSources;
    @FXML
    private TableColumn<Model, Double>activitiesFromForeignSources;
    @FXML
    private TableColumn<Model, Double>intellectualActivity;
    @FXML
    private TableColumn<Model, Double>TotalAreaBuildings;
    @FXML
    private TableColumn<Model, Double>AreaEducationalLaboratory;
    @FXML
    private TableColumn<Model, Double>AreaDesignatedResearch;
    @FXML
    private TableColumn<Model, Double>AreaDormitories;
    @FXML
    private TableColumn<Model, Double>AreaSports;
    @FXML
    private TableColumn<Model, Double>studentsNotProvidedHostel;
    @FXML
    private TableColumn<Model, Double>NumberPersonalComputers;
    @FXML
    private TableColumn<Model, Double>personalComputersWithInternet;
    @FXML
    private TableColumn<Model, Double>electronicLibrary;
    @FXML
    private TableColumn<Model, Double>UnivАllSources;
    @FXML
    private TableColumn<Model, Double>extraBudgetarySources;
    @FXML
    private TableColumn<Model, Double>shareextraBudgetarySources;
    @FXML
    private TableColumn<Model, Double>federalBudget;
    @FXML
    private TableColumn<Model, Double>localBudget;
    @FXML
    private TableColumn<Model, Double>incomeEducationalActivities;
    @FXML
    private TableColumn<Model, Double>total_income;
    @FXML
    private TableColumn<Model, Double>extraBudgetaryFunds;
    @FXML
    private TableColumn<Model, Double>extraBudgetaryResearch;



    @FXML
    public void initialize() {
        indicator.setCellValueFactory(new PropertyValueFactory<>("indicator"));
        year2018.setCellValueFactory(new PropertyValueFactory<>("year2018"));
        year2019.setCellValueFactory(new PropertyValueFactory<>("year2019"));
        year2020.setCellValueFactory(new PropertyValueFactory<>("year2020"));
        year2021.setCellValueFactory(new PropertyValueFactory<>("year2021"));
        year2022.setCellValueFactory(new PropertyValueFactory<>("year2022"));
        medialValueRF.setCellValueFactory(new PropertyValueFactory<>("medialValueRF"));
        medialSubject.setCellValueFactory(new PropertyValueFactory<>("medialSubject"));
        medialDepartment.setCellValueFactory(new PropertyValueFactory<>("medialDepartment"));

        ArrayList<Model> modelMains= DataBase.initGraphixPosition();
        for (Model model: modelMains
        ) {
            tablePosition.getItems().add(model);///!!!!!!!!!!!!!
        }

        f1.setCellValueFactory(new PropertyValueFactory<>("f1"));
        f2.setCellValueFactory(new PropertyValueFactory<>("f2"));
        f3.setCellValueFactory(new PropertyValueFactory<>("f3"));
        f4.setCellValueFactory(new PropertyValueFactory<>("f4"));
        f5.setCellValueFactory(new PropertyValueFactory<>("f5"));
        f6.setCellValueFactory(new PropertyValueFactory<>("f6"));
        f7.setCellValueFactory(new PropertyValueFactory<>("f7"));
        f8.setCellValueFactory(new PropertyValueFactory<>("f8"));
        f9.setCellValueFactory(new PropertyValueFactory<>("f9"));
        f10.setCellValueFactory(new PropertyValueFactory<>("f10"));
        f11.setCellValueFactory(new PropertyValueFactory<>("f11"));
        f12.setCellValueFactory(new PropertyValueFactory<>("f12"));
        f13.setCellValueFactory(new PropertyValueFactory<>("f13"));
        f14.setCellValueFactory(new PropertyValueFactory<>("f14"));
        f15.setCellValueFactory(new PropertyValueFactory<>("f15"));
        modelMains= DataBase.initGraphixEducActiv();
        for (Model model: modelMains
        ) {
            tableEduc_Activ.getItems().add(model);///!!!!!!!!!!!!!
        }
        b1.setCellValueFactory(new PropertyValueFactory<>("b1"));
        b2.setCellValueFactory(new PropertyValueFactory<>("b2"));
        b3.setCellValueFactory(new PropertyValueFactory<>("b3"));
        b4.setCellValueFactory(new PropertyValueFactory<>("b4"));
        b5.setCellValueFactory(new PropertyValueFactory<>("b5"));
        b6.setCellValueFactory(new PropertyValueFactory<>("b6"));
        b7.setCellValueFactory(new PropertyValueFactory<>("b7"));
        b8.setCellValueFactory(new PropertyValueFactory<>("b8"));
        b9.setCellValueFactory(new PropertyValueFactory<>("b9"));
        b10.setCellValueFactory(new PropertyValueFactory<>("b10"));
        b11.setCellValueFactory(new PropertyValueFactory<>("b11"));
        b12.setCellValueFactory(new PropertyValueFactory<>("b12"));
        b13.setCellValueFactory(new PropertyValueFactory<>("b13"));
        b14.setCellValueFactory(new PropertyValueFactory<>("b14"));
        b15.setCellValueFactory(new PropertyValueFactory<>("b15"));
        b16.setCellValueFactory(new PropertyValueFactory<>("b16"));
        modelMains= DataBase.initGraphixResrch_Activ();
        for (Model model: modelMains
        ) {
            tableResrch_Activ.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }

        d1.setCellValueFactory(new PropertyValueFactory<>("d1"));
        d2.setCellValueFactory(new PropertyValueFactory<>("d2"));
        d3.setCellValueFactory(new PropertyValueFactory<>("d3"));
        d4.setCellValueFactory(new PropertyValueFactory<>("d4"));
        d5.setCellValueFactory(new PropertyValueFactory<>("d5"));
        d6.setCellValueFactory(new PropertyValueFactory<>("d6"));
        d7.setCellValueFactory(new PropertyValueFactory<>("d7"));
        d8.setCellValueFactory(new PropertyValueFactory<>("d8"));
        d9.setCellValueFactory(new PropertyValueFactory<>("d9"));
        d10.setCellValueFactory(new PropertyValueFactory<>("d10"));
        d11.setCellValueFactory(new PropertyValueFactory<>("d11"));
        d12.setCellValueFactory(new PropertyValueFactory<>("d12"));
        d13.setCellValueFactory(new PropertyValueFactory<>("d13"));

        modelMains= DataBase.initGraphixInternational_activities();
        for (Model model: modelMains
        ) {
            tableInter_Act.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }

        IncomeEducationalOrganization.setCellValueFactory(new PropertyValueFactory<>("IncomeEducationalOrganization"));
        IncomeGeneratingActivities.setCellValueFactory(new PropertyValueFactory<>("IncomeGeneratingActivities"));
        averageSalaryNPR.setCellValueFactory(new PropertyValueFactory<>("averageSalaryNPR"));
        incomOrganization.setCellValueFactory(new PropertyValueFactory<>("incomOrganization"));

        modelMains= DataBase.initGraphixFInance_and_Economic();
        for (Model model: modelMains
        ) {
            tableFInance_and_Economic.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }
        c1.setCellValueFactory(new PropertyValueFactory<>("c1"));
        c2.setCellValueFactory(new PropertyValueFactory<>("c2"));
        c3.setCellValueFactory(new PropertyValueFactory<>("c3"));
        c4.setCellValueFactory(new PropertyValueFactory<>("c4"));
        c5.setCellValueFactory(new PropertyValueFactory<>("c5"));
        c6.setCellValueFactory(new PropertyValueFactory<>("c6"));
        c7.setCellValueFactory(new PropertyValueFactory<>("c7"));
        c8.setCellValueFactory(new PropertyValueFactory<>("c8"));

        modelMains= DataBase.initGraphixInfrastract();
        for (Model model: modelMains
        ) {
            tableInfrastract.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }
        a1.setCellValueFactory(new PropertyValueFactory<>("a1"));
        a2.setCellValueFactory(new PropertyValueFactory<>("a2"));
        a3.setCellValueFactory(new PropertyValueFactory<>("a3"));
        a4.setCellValueFactory(new PropertyValueFactory<>("a4"));
        a5.setCellValueFactory(new PropertyValueFactory<>("a5"));

        modelMains= DataBase.initGraphixPersonel();
        for (Model model: modelMains
        ) {
            tablePersonel.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }
        nameUgns.setCellValueFactory(new PropertyValueFactory<>("nameUgns"));
        shareStud.setCellValueFactory(new PropertyValueFactory<>("shareStud"));
        shareUgnsFromTotalStud.setCellValueFactory(new PropertyValueFactory<>("shareUgnsFromTotalStud"));
        shareFromTotalStud.setCellValueFactory(new PropertyValueFactory<>("shareFromTotalStud"));
        numberUniverImplEducation.setCellValueFactory(new PropertyValueFactory<>("numberUniverImplEducation"));
        numberOfBranches.setCellValueFactory(new PropertyValueFactory<>("numberOfBranches"));

        modelMains= DataBase.initGraphixUGNS();
        for (Model model: modelMains
        ) {
            tableUGNS.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }
        students_enrolled_in_bachelo.setCellValueFactory(new PropertyValueFactory<>("students_enrolled_in_bachelo"));
        includingFullTimeEducation.setCellValueFactory(new PropertyValueFactory<>("includingFullTimeEducation"));
        fullTimeEvening.setCellValueFactory(new PropertyValueFactory<>("fullTimeEvening"));
        correspondence_education.setCellValueFactory(new PropertyValueFactory<>("correspondence_education"));
        AverageScoreExam.setCellValueFactory(new PropertyValueFactory<>("AverageScoreExam"));
        proportionStudentsBachelor.setCellValueFactory(new PropertyValueFactory<>("proportionStudentsBachelor"));
        n_the_total.setCellValueFactory(new PropertyValueFactory<>("n_the_total"));
        share_of_students_enrolled_in_master.setCellValueFactory(new PropertyValueFactory<>("share_of_students_enrolled_in_master"));
        totalNumberStudentsAdditional.setCellValueFactory(new PropertyValueFactory<>("totalNumberStudentsAdditional"));
        totalNumberStudentsEnrolledSecondaryVocational.setCellValueFactory(new PropertyValueFactory<>("totalNumberStudentsEnrolledSecondaryVocational"));
        numberEnterprisesContracts.setCellValueFactory(new PropertyValueFactory<>("numberEnterprisesContracts"));
        numberEnterprisesContractsBasesPractice.setCellValueFactory(new PropertyValueFactory<>("numberEnterprisesContractsBasesPractice"));

        modelMains= DataBase.initGraphixAddit_Educ_Act();
        for (Model model: modelMains
        ) {
            tableAddit_Educ_Act.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }

        amountFundsReceived.setCellValueFactory(new PropertyValueFactory<>("amountFundsReceived"));
        fundsPerformanceWorks.setCellValueFactory(new PropertyValueFactory<>("fundsPerformanceWorks"));
        totalNumberPublications.setCellValueFactory(new PropertyValueFactory<>("totalNumberPublications"));
        NumberBusinessIncubators.setCellValueFactory(new PropertyValueFactory<>("NumberBusinessIncubators"));
        NumberTechnoparks.setCellValueFactory(new PropertyValueFactory<>("NumberTechnoparks"));
        NumberCentersScientific.setCellValueFactory(new PropertyValueFactory<>("NumberCentersScientific"));
        NumberSmallEnterprises.setCellValueFactory(new PropertyValueFactory<>("NumberSmallEnterprises"));
        NumberGraduateStudents.setCellValueFactory(new PropertyValueFactory<>("NumberGraduateStudents"));
        PercentagePostgraduates.setCellValueFactory(new PropertyValueFactory<>("PercentagePostgraduates"));
        numberDoctoral.setCellValueFactory(new PropertyValueFactory<>("numberDoctoral"));
        NumberDissertation.setCellValueFactory(new PropertyValueFactory<>("NumberDissertation"));
        modelMains= DataBase.initGraphixAddit_research_activities();
        for (Model model: modelMains
        ) {
            tableAddit_research_activities.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }

        totalNumberEmployees.setCellValueFactory(new PropertyValueFactory<>("totalNumberEmployees"));
        TotalNumberTeaching.setCellValueFactory(new PropertyValueFactory<>("TotalNumberTeaching"));
        TotalNumberResearchers.setCellValueFactory(new PropertyValueFactory<>("TotalNumberResearchers"));
        PercentageTeachingStaff.setCellValueFactory(new PropertyValueFactory<>("PercentageTeachingStaff"));
        researchersWithAcademic.setCellValueFactory(new PropertyValueFactory<>("researchersWithAcademic"));
        PercentageTeachingStaffThan65Years.setCellValueFactory(new PropertyValueFactory<>("PercentageTeachingStaffThan65Years"));
        PercentageTeachingStaffThan40Years.setCellValueFactory(new PropertyValueFactory<>("PercentageTeachingStaffThan40Years"));
        AverageSalaryTeaching.setCellValueFactory(new PropertyValueFactory<>("AverageSalaryTeaching"));
        AverageSalaryResearchers.setCellValueFactory(new PropertyValueFactory<>("AverageSalaryResearchers"));
        modelMains= DataBase.initGraphixAddition_personnel();
        for (Model model: modelMains
        ) {
            tableAddition_personnel.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }
        studentsEnrolledBachelor.setCellValueFactory(new PropertyValueFactory<>("studentsEnrolledBachelor"));
        foreignStudents.setCellValueFactory(new PropertyValueFactory<>("foreignStudents"));
        higherEducation.setCellValueFactory(new PropertyValueFactory<>("higherEducation"));
        obtainingTwoDiplomas.setCellValueFactory(new PropertyValueFactory<>("obtainingTwoDiplomas"));
        foreignGraduateStudents.setCellValueFactory(new PropertyValueFactory<>("foreignGraduateStudents"));
        jointlyWithForeignOrganizations.setCellValueFactory(new PropertyValueFactory<>("jointlyWithForeignOrganizations"));
        IncomeForeignSources.setCellValueFactory(new PropertyValueFactory<>("IncomeForeignSources"));
        activitiesFromForeignSources.setCellValueFactory(new PropertyValueFactory<>("activitiesFromForeignSources"));
        intellectualActivity.setCellValueFactory(new PropertyValueFactory<>("intellectualActivity"));
        modelMains= DataBase.initGraphixAddition_international_activities();
        for (Model model: modelMains
        ) {
            tableAddition_international_activities.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }

        TotalAreaBuildings.setCellValueFactory(new PropertyValueFactory<>("TotalAreaBuildings"));
        AreaEducationalLaboratory.setCellValueFactory(new PropertyValueFactory<>("AreaEducationalLaboratory"));
        AreaDesignatedResearch.setCellValueFactory(new PropertyValueFactory<>("AreaDesignatedResearch"));
        AreaDormitories.setCellValueFactory(new PropertyValueFactory<>("AreaDormitories"));
        AreaSports.setCellValueFactory(new PropertyValueFactory<>("AreaSports"));
        studentsNotProvidedHostel.setCellValueFactory(new PropertyValueFactory<>("studentsNotProvidedHostel"));
        NumberPersonalComputers.setCellValueFactory(new PropertyValueFactory<>("NumberPersonalComputers"));
        personalComputersWithInternet.setCellValueFactory(new PropertyValueFactory<>("personalComputersWithInternet"));
        electronicLibrary.setCellValueFactory(new PropertyValueFactory<>("electronicLibrary"));
        modelMains= DataBase.initGraphixAddition_infrastructure();
        for (Model model: modelMains
        ) {
            tableAddition_infrastructure.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }
        //.setCellValueFactory(new PropertyValueFactory<>(""));
        UnivАllSources.setCellValueFactory(new PropertyValueFactory<>("UnivАllSources"));
        extraBudgetarySources.setCellValueFactory(new PropertyValueFactory<>("extraBudgetarySources"));
        shareextraBudgetarySources.setCellValueFactory(new PropertyValueFactory<>("shareextraBudgetarySources"));
        federalBudget.setCellValueFactory(new PropertyValueFactory<>("federalBudget"));
        localBudget.setCellValueFactory(new PropertyValueFactory<>("localBudget"));
        incomeEducationalActivities.setCellValueFactory(new PropertyValueFactory<>("incomeEducationalActivities"));
        total_income.setCellValueFactory(new PropertyValueFactory<>("total_income"));
        extraBudgetaryFunds.setCellValueFactory(new PropertyValueFactory<>("extraBudgetaryFunds"));
        extraBudgetaryResearch.setCellValueFactory(new PropertyValueFactory<>("extraBudgetaryResearch"));
        modelMains= DataBase.initGraphixAddition_financial_and_economic_activity();
        for (Model model: modelMains
        ) {
            tableAddition_financial_and_economic_activity.getItems().add(model);///ОШИБКА В НАЗВАНИИ ТАБЛИЦЫ id ЗАМЕНИ
        }
    }
    @FXML
    private void setExit(){


        // Обработчик нажатия кнопки "Выход"
        exit.setOnAction(event -> {
            System.exit(0);
        });
    }
    @FXML
    public void switchToAddInfo()  {
        Stage stage = (Stage) exit.getScene().getWindow(); // получаем Stage текущего окна
        stage.close(); // закрываем текущее окно

        // Загрузка FXML и открытие нового окна
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Addinfo.fxml"));
        try {
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.show();
        }catch (Exception e ){}

    }
    @FXML
    public void switchToTopUniverse()  {
        Stage stage = (Stage) exit.getScene().getWindow(); // получаем Stage текущего окна
        stage.close(); // закрываем текущее окно

        // Загрузка FXML и открытие нового окна
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
        try {
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.show();
        }catch (Exception e ){}

    }
    public void switchToGraphixImprove()  {
        Stage stage = (Stage) exit.getScene().getWindow(); // получаем Stage текущего окна
        stage.close(); // закрываем текущее окно

        // Загрузка FXML и открытие нового окна
        FXMLLoader loader = new FXMLLoader(getClass().getResource("GraphixImprove.fxml"));
        try {
            Parent root = loader.load();
            Stage newStage = new Stage();
            newStage.setScene(new Scene(root));
            newStage.show();
        }catch (Exception e ){
            //System.out.printf(String.valueOf(e));
            //e.printStackTrace();
        }

    }
}
