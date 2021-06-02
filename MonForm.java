package monit;
import static monit.editPanel.USD_RATE;
import static monit.editPanel.WON_RATE;
import static monit.editPanel.KES_RATE;
import static monit.editPanel.GBP_RATE;
import static monit.editPanel.EUR_RATE;
import static monit.editPanel.YUN_RATE;
import static monit.editPanel.YEN_RATE;
import static monit.editPanel.RUP_RATE;
import static monit.editPanel.FRC_RATE;
import static monit.editPanel.KRN_RATE;
import static monit.editPanel.GHS_RATE;
import static monit.editPanel.GAM_RATE;
import static monit.editPanel.NGI_RATE;
import static monit.editPanel.NPA_RATE;
import static monit.editPanel.NIC_RATE;
import static monit.editPanel.LAO_RATE;
import static monit.editPanel.ROM_RATE;
import static monit.editPanel.MOZ_RATE;
import static monit.editPanel.MYM_RATE;
import static monit.editPanel.MDG_RATE;

public class MonForm extends javax.swing.JFrame  {
    editPanel ep = new editPanel();
    
     
    

    public MonForm() {
        initComponents();
    }
   
    public static boolean isStringDouble(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
    
    public float wonTodollar(float won){
        float result = won/USD_RATE;
        return result;
    }
    
    public float dollarTowon(float dollar){
        float result = dollar/WON_RATE;
        return result;
        
    }

    public float wonToKES(float won){
        float result = won/KES_RATE;
        return result;
    }
    
    public float dollarToKES(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float kesTowon(float kes){
        float result = kes * KES_RATE;
        return result;
    }
    
    public float kesTodollar(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float wonToGBP(float won){
        float result = won / GBP_RATE;
        return result;
    }
    
    public float dollarToGBP(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    public float kesToGBP(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float gbpTowon(float gbp){
        float result = gbp * GBP_RATE;
        return result;
    }
    
    public float gbpTodollar(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float gbpToKES(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float wonToEuro(float euro){
        float result = euro / EUR_RATE;
        return result;
    }
    
    public float dollarToEuro(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float kesToEuro(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float gbpToEuro(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float euroToWon(float euro){
        float result = euro * EUR_RATE;
        return result;
    }
    
    public float yuanToWon(float yuan){
        float result = yuan * YUN_RATE;
        return result;
    }
    
    public float yenToWon(float yen){
        float result = yen * YEN_RATE;
        return result;
    }
    
    public float rupToWon(float rup){
        float result = rup * RUP_RATE;
        return result;
    }
    
    public float francToWon(float franc){
        float result = franc * FRC_RATE;
        return result;
    }
    
    public float kronaToWon(float krona){
        float result = krona * KRN_RATE;
        return result;
    }
    
    public float euroTodollar(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float yuanTodollar(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float yenTodollar(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float rupTodollar(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float francTodollar(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float kronaTodollar(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float euroToKES(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float yuanToKES(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float yenToKES(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float rupToKES(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float francToKES(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float kronaToKES(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float euroToGBP(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float yuanToGBP(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float yenToGBP(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float rupToGBP(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float francToGBP(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float kronaToGBP(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float yuanToEuro(float euro){
        float tmp = euro * YUN_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float yenToEuro(float euro){
        float tmp = euro * YEN_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float rupToEuro(float euro){
        float tmp = euro * RUP_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float francToEuro(float euro){
        float tmp = euro * FRC_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float kronaToEuro(float euro){
        float tmp = euro * KRN_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float wonToYuan(float yuan){
        float result = yuan / YUN_RATE;
        return result;
    }
    
    public float wonToYen(float yen){
        float result = yen / YEN_RATE;
        return result;
    }
    
    public float wonToRup(float rup){
        float result = rup / RUP_RATE;
        return result;
    }
    
    public float wonToFranc(float franc){
        float result = franc / FRC_RATE;
        return result;
    }
    
    public float wonToKrona(float krona){
        float result = krona / KRN_RATE;
        return result;
    }
    
    public float dollarToYuan(float yuan){
        float tmp = yuan / WON_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float dollarToYen(float yen){
        float tmp = yen / WON_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float dollarToRup(float rup){
        float tmp = rup / WON_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float dollarToFranc(float franc){
        float tmp = franc / WON_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float dollarToKrona(float krona){
        float tmp = krona / WON_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float kesToYuan(float yuan){
        float tmp = yuan * KES_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float kesToYen(float yen){
        float tmp = yen * KES_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float kesToRup(float rup){
        float tmp = rup * KES_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float kesToFranc(float franc){
        float tmp = franc * KES_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float kesToKrona(float krona){
        float tmp = krona * KES_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float gbpToYuan(float yuan){
        float tmp = yuan * GBP_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float gbpToYen(float yen){
        float tmp = yen * GBP_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float gbpToRup(float rup){
        float tmp = rup * GBP_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float gbpToFranc(float franc){
        float tmp = franc * GBP_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float gbpToKrona(float krona){
        float tmp = krona * GBP_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float euroToYuan(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float euroToYen(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float euroToRup(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float euroToFranc(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float euroToKrona(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float yuanToYen(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float yuanToRup(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float yuanToFranc(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float yuanToKrona(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float yenToYuan(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float yenToRup(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float yenToFranc(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float yenToKrona(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float rupToYuan(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float rupToYen(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float rupToFranc(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float rupToKrona(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float francToYuan(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float francToYen(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float francToRup(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float francToKrona(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float kronaToYuan(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float kronaToYen(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float kronaToRup(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float kronaToFranc(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float ghsToWon(float cedi){
        float result = cedi * GHS_RATE;
        return result;
    }
    
    public float gamToWon(float gam){
        float result = gam * GAM_RATE;
        return result;
    }
    
    public float ngiToWon(float ngi){
        float result = ngi * NGI_RATE;
        return result;
    }
    
    public float npaToWon(float npa){
        float result = npa * NPA_RATE;
        return result;
    }
    
    public float nicToWon(float nic){
        float result = nic * NIC_RATE;
        return result;
    }
    
    public float laoToWon(float lao){
        float result = lao * LAO_RATE;
        return result;
    }
    
    public float romToWon(float rom){
        float result = rom * ROM_RATE;
        return result;
    }
    
    public float mozToWon(float moz){
        float result = moz * MOZ_RATE;
        return result;
    }
    
    public float mymToWon(float mym){
        float result = mym * MYM_RATE;
        return result;
    }
    
    public float mdgToWon(float mdg){
        float result = mdg * MDG_RATE;
        return result;
    }
    
    public float ghsTodollar(float dollar){
        float tmp = dollar * GHS_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float gamTodollar(float dollar){
        float tmp = dollar * GAM_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float ngiTodollar(float dollar){
        float tmp = dollar * NGI_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float npaTodollar(float dollar){
        float tmp = dollar * NPA_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float nicTodollar(float dollar){
        float tmp = dollar * NIC_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float laoTodollar(float dollar){
        float tmp = dollar * LAO_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float romTodollar(float dollar){
        float tmp = dollar * ROM_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float mozTodollar(float dollar){
        float tmp = dollar * MOZ_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float mymTodollar(float dollar){
        float tmp = dollar * MYM_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
    
    public float mdgTodollar(float dollar){
        float tmp = dollar * MDG_RATE;
        float result = tmp / USD_RATE;
        return result;
    }
  
    public float ghsToKES(float KES){
        float tmp = KES * GHS_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float gamToKES(float KES){
        float tmp = KES * GAM_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float ngiToKES(float KES){
        float tmp = KES * NGI_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float npaToKES(float KES){
        float tmp = KES * NPA_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float nicToKES(float KES){
        float tmp = KES * NIC_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float laoToKES(float KES){
        float tmp = KES * LAO_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float romToKES(float KES){
        float tmp = KES * ROM_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    
    public float mozToKES(float KES){
        float tmp = KES * MOZ_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float mymToKES(float KES){
        float tmp = KES * MYM_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float mdgToKES(float KES){
        float tmp = KES * MDG_RATE;
        float result = tmp / KES_RATE;
        return result;
    }
    
    public float ghsToGBP(float GBP){
        float tmp = GBP * GHS_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float gamToGBP(float GBP){
        float tmp = GBP * GAM_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float ngiToGBP(float GBP){
        float tmp = GBP * NGI_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float npaToGBP(float GBP){
        float tmp = GBP * NPA_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float nicToGBP(float GBP){
        float tmp = GBP * NIC_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float laoToGBP(float GBP){
        float tmp = GBP * LAO_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float romToGBP(float GBP){
        float tmp = GBP * ROM_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float mozToGBP(float GBP){
        float tmp = GBP * MOZ_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float mymToGBP(float GBP){
        float tmp = GBP * MYM_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float mdgToGBP(float GBP){
        float tmp = GBP * MDG_RATE;
        float result = tmp / GBP_RATE;
        return result;
    }
    
    public float ghsToEuro(float euro){
        float tmp = euro * GHS_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float gamToEuro(float euro){
        float tmp = euro * GAM_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float ngiToEuro(float euro){
        float tmp = euro * NGI_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float npaToEuro(float euro){
        float tmp = euro * NPA_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float nicToEuro(float euro){
        float tmp = euro * NIC_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float laoToEuro(float euro){
        float tmp = euro * LAO_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float romToEuro(float euro){
        float tmp = euro * ROM_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float mozToEuro(float euro){
        float tmp = euro * MOZ_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float mymToEuro(float euro){
        float tmp = euro * MYM_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float mdgToEuro(float euro){
        float tmp = euro * MDG_RATE;
        float result = tmp / EUR_RATE;
        return result;
    }
    
    public float ghsToYuan(float yuan){
        float tmp = yuan * GHS_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float gamToYuan(float yuan){
        float tmp = yuan * GAM_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float ngiToYuan(float yuan){
        float tmp = yuan * NGI_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float npaToYuan(float yuan){
        float tmp = yuan * NPA_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float nicToYuan(float yuan){
        float tmp = yuan * NIC_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float laoToYuan(float yuan){
        float tmp = yuan * LAO_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float romToYuan(float yuan){
        float tmp = yuan * ROM_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float mozToYuan(float yuan){
        float tmp = yuan * MOZ_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float mymToYuan(float yuan){
        float tmp = yuan * MYM_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float mdgToYuan(float yuan){
        float tmp = yuan * MDG_RATE;
        float result = tmp / YUN_RATE;
        return result;
    }
    
    public float ghsToYen(float yen){
        float tmp = yen * GHS_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float gamToYen(float yen){
        float tmp = yen * GAM_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float ngiToYen(float yen){
        float tmp = yen * NGI_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float npaToYen(float yen){
        float tmp = yen * NPA_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float nicToYen(float yen){
        float tmp = yen * NIC_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float laoToYen(float yen){
        float tmp = yen * LAO_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float romToYen(float yen){
        float tmp = yen * ROM_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float mozToYen(float yen){
        float tmp = yen * MOZ_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float mymToYen(float yen){
        float tmp = yen * MYM_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float mdgToYen(float yen){
        float tmp = yen * MDG_RATE;
        float result = tmp / YEN_RATE;
        return result;
    }
    
    public float ghsToRup(float rupi){
        float tmp = rupi * GHS_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float gamToRup(float rupi){
        float tmp = rupi * GAM_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float ngiToRup(float rupi){
        float tmp = rupi * NGI_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float npaToRup(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float nicToRup(float rupi){
        float tmp = rupi * NIC_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float laoToRup(float rupi){
        float tmp = rupi * LAO_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float romToRup(float rupi){
        float tmp = rupi * ROM_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float mozToRup(float rupi){
        float tmp = rupi * MOZ_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float mymToRup(float rupi){
        float tmp = rupi * MYM_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float mdgToRup(float rupi){
        float tmp = rupi * MDG_RATE;
        float result = tmp / RUP_RATE;
        return result;
    }
    
    public float ghsToFranc(float franc){
        float tmp = franc * GHS_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float gamToFranc(float franc){
        float tmp = franc * GAM_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float ngiToFranc(float franc){
        float tmp = franc * NGI_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float npaToFranc(float franc){
        float tmp = franc * NPA_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float nicToFranc(float franc){
        float tmp = franc * NIC_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float laoToFranc(float franc){
        float tmp = franc * LAO_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float romToFranc(float franc){
        float tmp = franc * ROM_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float mozToFranc(float franc){
        float tmp = franc * MOZ_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float mymToFranc(float franc){
        float tmp = franc * MYM_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float mdgToFranc(float franc){
        float tmp = franc * MDG_RATE;
        float result = tmp / FRC_RATE;
        return result;
    }
    
    public float ghsToKrona(float Krona){
        float tmp = Krona * GHS_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float ngiToKrona(float Krona){
        float tmp = Krona * NGI_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float npaToKrona(float Krona){
        float tmp = Krona * NPA_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float nicToKrona(float Krona){
        float tmp = Krona * NIC_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float laoToKrona(float Krona){
        float tmp = Krona * LAO_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float romToKrona(float Krona){
        float tmp = Krona * ROM_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float mozToKrona(float Krona){
        float tmp = Krona * MOZ_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float mymToKrona(float Krona){
        float tmp = Krona * MYM_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float mdgToKrona(float Krona){
        float tmp = Krona * MDG_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float gamToKrona(float Krona){
        float tmp = Krona * GAM_RATE;
        float result = tmp / KRN_RATE;
        return result;
    }
    
    public float wonToGhs(float won){
        float result = won / GHS_RATE;
        return result;
    }
  
    public float wonToGam(float won){
        float result = won / GAM_RATE;
        return result;
    }
    
    public float wonToNGI(float won){
        float result = won / NGI_RATE;
        return result;
    }
    
    public float wonToNPA(float won){
        float result = won / NPA_RATE;
        return result;
    }
    
    public float wonToNIC(float won){
        float result = won / NIC_RATE;
        return result;
    }
    
    public float wonToLAO(float won){
        float result = won / LAO_RATE;
        return result;
    }
    
    public float wonToROM(float won){
        float result = won / ROM_RATE;
        return result;
    }
    
    public float wonToMOZ(float won){
        float result = won / MOZ_RATE;
        return result;
    }
    
    public float wonToMYM(float won){
        float result = won / MYM_RATE;
        return result;
    }
    
    public float wonToMDG(float won){
        float result = won / MDG_RATE;
        return result;
    }
    
    public float dollarToGHS(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float dollarToGAM(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float dollarToNGI(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float dollarToNPA(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float dollarToNIC(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float dollarToLAO(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float dollarToROM(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float dollarToMOZ(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float dollarToMYM(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float dollarToMDG(float dollar){
        float tmp = dollar / WON_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float kesToGHS(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float kesToGAM(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float kesToNGI(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float kesToNPA(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float kesToNIC(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float kesToLAO(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float kesToROM(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float kesToMOZ(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    
    public float kesToMYM(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float kesToMDG(float kes){
        float tmp = kes * KES_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float gbpToGHS(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float gbpToGAM(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float gbpToNGI(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float gbpToNPA(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    
    public float gbpToNIC(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float gbpToLAO(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float gbpToROM(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float gbpToMOZ(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    
    public float gbpToMYM(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float gbpToMDG(float gbp){
        float tmp = gbp * GBP_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float euroToGHS(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float euroToGAM(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float euroToNGI(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float euroToNPA(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float euroToNIC(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float euroToLAO(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float euroToROM(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float euroToMOZ(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float euroToMYM(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float euroToMDG(float euro){
        float tmp = euro * EUR_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float yuanToGHS(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    
    public float yuanToGAM(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float yuanToNGI(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float yuanToNPA(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float yuanToNIC(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float yuanToLAO(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float yuanToROM(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float yuanToMOZ(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float yuanToMYM(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float yuanToMDG(float yuan){
        float tmp = yuan * YUN_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float yenToGHS(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float yenToGAM(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float yenToNGI(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float yenToNPA(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float yenToNIC(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float yenToLAO(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float yenToROM(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float yenToMOZ(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float yenToMYM(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float yenToMDG(float yen){
        float tmp = yen * YEN_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float rupToGHS(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float rupToGAM(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float rupToNGI(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float rupToNPA(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float rupToNIC(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float rupToLAO(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float rupToROM(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float rupToMOZ(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float rupToMYM(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float rupToMDG(float rup){
        float tmp = rup * RUP_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float francToGHS(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float francToGAM(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float francToNGI(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float francToNPA(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float francToNIC(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float francToLAO(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float francToROM(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float francToMOZ(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float francToMYM(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float francToMDG(float franc){
        float tmp = franc * FRC_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float kronaToGHS(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float kronaToGAM(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float kronaToNGI(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float kronaToNPA(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float kronaToNIC(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float kronaToLAO(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float kronaToROM(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float kronaToMOZ(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float kronaToMYM(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float kronaToMDG(float krona){
        float tmp = krona * KRN_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float ghsToGAM(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float ghsToNGI(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float ghsToNPA(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float ghsToNIC(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float ghsToLAO(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float ghsToROM(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float ghsToMOZ(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float ghsToMYM(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float ghsToMDG(float ghs){
        float tmp = ghs * GHS_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float gamToGHS(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float gamToNGI(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float gamToNPA(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float gamToNIC(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float gamToLAO(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float gamToROM(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float gamToMOZ(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float gamToMYM(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float gamToMDG(float gam){
        float tmp = gam * GAM_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float ngiToGHS(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    public float ngiToGAM(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    public float ngiToNPA(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    public float ngiToNIC(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    public float ngiToLAO(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    public float ngiToROM(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    public float ngiToMOZ(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    public float ngiToMYM(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    public float ngiToMDG(float ngi){
        float tmp = ngi * NGI_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float npaToGHS(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float npaToGAM(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float npaToNGI(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float npaToNIC(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float npaToLAO(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float npaToROM(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float npaToMOZ(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float npaToMYM(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float npaToMDG(float rupi){
        float tmp = rupi * NPA_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float nicToGHS(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float nicToGAM(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float nicToNGI(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float nicToNPA(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float nicToLAO(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float nicToROM(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float nicToMOZ(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float nicToMYM(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float nicToMDG(float nic){
        float tmp = nic * NIC_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float laoToGHS(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }

    public float laoToGAM(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float laoToNGI(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float laoToNPA(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float laoToNIC(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float laoToROM(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float laoToMOZ(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float laoToMYM(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float laoToMDG(float lao){
        float tmp = lao * LAO_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float romToGHS(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float romToGAM(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float romToNGI(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float romToNPA(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float romToNIC(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float romToLAO(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float romToMOZ(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float romToMYM(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float romToMDG(float rom){
        float tmp = rom * ROM_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float mozToGHS(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float mozToGAM(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float mozToNGI(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float mozToNPA(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float mozToNIC(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float mozToLAO(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float mozToROM(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float mozToMYM(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
    public float mozToMDG(float moz){
        float tmp = moz * MOZ_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float mymToGHS(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float mymToGAM(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    public float mymToNGI(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    
    public float mymToNPA(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float mymToNIC(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    
    public float mymToLAO(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float mymToROM(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float mymToMOZ(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float mymToMDG(float mym){
        float tmp = mym * MYM_RATE;
        float result = tmp / MDG_RATE;
        return result;
    }
    
    public float mdgToGHS(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / GHS_RATE;
        return result;
    }
    
    public float mdgToGAM(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / GAM_RATE;
        return result;
    }
    
    
    public float mdgToNGI(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / NGI_RATE;
        return result;
    }
    
    public float mdgToNPA(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / NPA_RATE;
        return result;
    }
    
    public float mdgToNIC(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / NIC_RATE;
        return result;
    }
    public float mdgToLAO(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / LAO_RATE;
        return result;
    }
    
    public float mdgToROM(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / ROM_RATE;
        return result;
    }
    
    public float mdgToMOZ(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / MOZ_RATE;
        return result;
    }
    
    public float mdgToMYM(float mdg){
        float tmp = mdg * MDG_RATE;
        float result = tmp / MYM_RATE;
        return result;
    }
    
  
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLab = new javax.swing.JLabel();
        amountLab = new javax.swing.JLabel();
        fromLab = new javax.swing.JLabel();
        toLab = new javax.swing.JLabel();
        toCom = new javax.swing.JComboBox<>();
        fromCom = new javax.swing.JComboBox<>();
        amountTex = new javax.swing.JTextField();
        resultLab = new javax.swing.JLabel();
        resultshowLab = new javax.swing.JLabel();
        convertBut = new javax.swing.JButton();
        resetBut = new javax.swing.JButton();
        rateLab = new javax.swing.JLabel();
        editBut = new javax.swing.JButton();
        rateshowLab = new javax.swing.JLabel();
        setBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monetary Unit Converter");
        setResizable(false);

        nameLab.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        nameLab.setText("Please Edit Rate Before Converting! (KR, Won Standard)");

        amountLab.setText("Convert This Amount");

        fromLab.setText("From This Country");

        toLab.setText("To This Country");

        toCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Click Set Button" }));
        toCom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        fromCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select", " KR, Won ", " US, Dollar ", " KY, KES ", " GB, GBP ", " EUR, Euro ", " CN, Yuan ", " JP, Yen ", " IDN, Rupiah ", " CH, Franc ", " SE, Krona ", " GH, Cedi ", " GAM, Dalasi ", " NG, Naira ", " NP, Rupee ", " NI, Cordoba ", " LAO, Kip ", " ROM, Leu ", " MOZ, Metical ", " MYM, Kyat ", " MG, Ariary " }));

        amountTex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTexActionPerformed(evt);
            }
        });

        resultLab.setText("Result:");

        resultshowLab.setText("...");

        convertBut.setText("Convert");
        convertBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertButActionPerformed(evt);
            }
        });

        resetBut.setText("Clear");
        resetBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButActionPerformed(evt);
            }
        });

        rateLab.setText("Current Rate");

        editBut.setText("Edit Rate");
        editBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButActionPerformed(evt);
            }
        });

        rateshowLab.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        rateshowLab.setText("-----------------------------------------------------------------------");

        setBut.setText("Set");
        setBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amountTex, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountLab))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fromCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fromLab))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(toLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(toCom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(nameLab))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rateLab)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(rateshowLab, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(setBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(convertBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetBut)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBut))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(resultLab)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resultshowLab, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLab, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLab)
                    .addComponent(fromLab)
                    .addComponent(toLab)
                    .addComponent(rateLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fromCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rateshowLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resultLab)
                    .addComponent(resultshowLab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertBut)
                    .addComponent(resetBut)
                    .addComponent(editBut)
                    .addComponent(setBut))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void amountTexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTexActionPerformed

    private void convertButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertButActionPerformed
        String result = "";
        
        if(!isStringDouble(amountTex.getText())){
            resultshowLab.setText("Error Please use Integer or Float");
        }
       
        if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(wonTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
        }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(dollarTowon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(wonToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
       else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(dollarToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " * " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(kesTowon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(kesTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }   
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(wonToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }   
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(dollarToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(kesToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(gbpTowon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " * " + String.valueOf(WON_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(gbpTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(gbpToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(wonToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(dollarToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() +  " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(euroToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " * " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(yuanToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " * " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(yenToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " * " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(rupToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " * " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(francToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " * " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(kronaToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " * " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(kesToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(gbpToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(euroTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(yuanTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(yenTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(rupTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(francTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(kronaTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(euroToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(yuanToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(yenToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(rupToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(francToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(kronaToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(euroToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(yuanToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(yenToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(rupToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(francToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(kronaToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(yuanToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(yenToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(rupToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(francToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(kronaToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(wonToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(wonToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(wonToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(wonToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(wonToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(dollarToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(dollarToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(dollarToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(dollarToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(dollarToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(kesToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(kesToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(kesToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(kesToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(kesToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(gbpToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(gbpToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(gbpToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(gbpToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(gbpToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(euroToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(euroToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(euroToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(euroToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(euroToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(yuanToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(yuanToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(yuanToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(yuanToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(yenToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(yenToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(yenToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(yenToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(rupToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(rupToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(rupToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(rupToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(francToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(francToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(francToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(francToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(kronaToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(kronaToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(kronaToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(kronaToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(ghsToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(gamToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(ngiToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(npaToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(nicToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(laoToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(romToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(ghsToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(mymToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" KR, Won ")){
           result = Float.toString(mdgToWon(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(ghsTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(gamTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(ngiTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(npaTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(nicTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(laoTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(romTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(mozTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(mymTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" US, Dollar ")){
           result = Float.toString(mdgTodollar(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(USD_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(ghsToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(gamToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(ngiToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(npaToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(nicToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(laoToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(romToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(mozToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(mymToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" KY, KES ")){
           result = Float.toString(mdgToKES(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(KES_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(ghsToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(gamToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(ngiToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(npaToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(nicToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(laoToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(romToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(mozToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(mymToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" GB, GBP ")){
           result = Float.toString(mdgToGBP(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(GBP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(ghsToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(gamToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(ngiToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(npaToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(nicToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(laoToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(romToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(mozToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(mymToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" EUR, Euro ")){
           result = Float.toString(mdgToEuro(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(EUR_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(ghsToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(gamToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(ngiToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(npaToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(nicToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(laoToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(romToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(mozToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(mymToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" CN, Yuan ")){
           result = Float.toString(mdgToYuan(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(YUN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(ghsToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(gamToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(ngiToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(npaToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(nicToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(laoToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(romToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(mozToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(mymToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" JP, Yen ")){
           result = Float.toString(mdgToYen(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(YEN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(ghsToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(gamToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(ngiToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(npaToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(nicToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(laoToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(romToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(mozToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(mymToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" IDN, Rupiah ")){
           result = Float.toString(mdgToRup(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(RUP_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(ghsToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(gamToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(ngiToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(npaToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(nicToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(laoToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(romToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(mozToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(mymToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" CH, Franc ")){
           result = Float.toString(mdgToFranc(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(FRC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(ghsToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(gamToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(ngiToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(npaToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(nicToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(laoToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(romToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(mozToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(mymToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" SE, Krona ")){
           result = Float.toString(mdgToKrona(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(KRN_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(wonToGhs(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(wonToGam(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(wonToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(wonToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(wonToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(wonToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(wonToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(wonToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(wonToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" KR, Won ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(wonToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(dollarToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(dollarToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(dollarToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(dollarToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       } 
        
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(dollarToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       } 
        
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(dollarToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(dollarToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(dollarToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(dollarToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" US, Dollar ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(dollarToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " / " + String.valueOf(WON_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       } 
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(kesToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(kesToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(kesToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(kesToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(kesToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(kesToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(kesToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(kesToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(kesToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" KY, KES ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(kesToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KES_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(gbpToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(gbpToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(gbpToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(gbpToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(gbpToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(gbpToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(gbpToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(gbpToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(gbpToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }  
        else if(fromCom.getSelectedItem().equals(" GB, GBP ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(gbpToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GBP_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(euroToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(euroToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(euroToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(euroToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(euroToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(euroToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(euroToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(euroToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(euroToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(euroToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(EUR_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(yuanToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(yuanToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(yuanToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(yuanToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(yuanToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(yuanToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(yuanToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(yuanToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(yuanToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(yuanToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YUN_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(yenToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(yenToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(yenToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(yenToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(yenToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(yenToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(yenToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(yenToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(yenToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(yenToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(YEN_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(rupToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(rupToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(rupToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(rupToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(rupToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(rupToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(rupToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(rupToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(rupToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(rupToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(RUP_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(francToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(francToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(francToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(francToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(francToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(francToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(francToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(francToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(francToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(francToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(FRC_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(kronaToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(kronaToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(kronaToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(kronaToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(kronaToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(kronaToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(kronaToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(kronaToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(kronaToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(kronaToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(KRN_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(ghsToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(ghsToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(ghsToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(ghsToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(ghsToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(ghsToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(ghsToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(ghsToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(ghsToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GHS_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(gamToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(gamToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(gamToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(gamToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(gamToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(gamToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(gamToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(gamToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(gamToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(GAM_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(ngiToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(ngiToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(ngiToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(ngiToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(ngiToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(ngiToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(ngiToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(ngiToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(ngiToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NGI_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(npaToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(npaToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(npaToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(npaToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(npaToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(npaToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(npaToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(npaToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(npaToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NPA_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(nicToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(nicToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(nicToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(nicToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(nicToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(nicToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(nicToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(nicToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(nicToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(NIC_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(laoToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(laoToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(laoToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(laoToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(laoToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(laoToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(laoToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(laoToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(laoToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(LAO_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(romToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(romToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(romToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(romToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(romToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(romToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(romToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(romToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(romToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(ROM_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(mozToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(mozToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(mozToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(mozToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(mozToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(mozToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(mozToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(mozToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(mozToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MOZ_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(mymToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(mymToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(mymToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(mymToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(mymToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(mymToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(mymToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(mymToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ") && toCom.getSelectedItem().equals(" MG, Ariary ")){
           result = Float.toString(mymToMDG(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MYM_RATE) + " / " + String.valueOf(MDG_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" GH, Cedi ")){
           result = Float.toString(mdgToGHS(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(GHS_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" GAM, Dalasi ")){
           result = Float.toString(mdgToGAM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(GAM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" NG, Naira ")){
           result = Float.toString(mdgToNGI(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(NGI_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" NP, Rupee ")){
           result = Float.toString(mdgToNPA(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(NPA_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" NI, Cordoba ")){
           result = Float.toString(mdgToNIC(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(NIC_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" LAO, Kip ")){
           result = Float.toString(mdgToLAO(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(LAO_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" ROM, Leu ")){
           result = Float.toString(mdgToROM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(ROM_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" MOZ, Metical ")){
           result = Float.toString(mdgToMOZ(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(MOZ_RATE) + " = " + resultshowLab.getText());
       }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ") && toCom.getSelectedItem().equals(" MYM, Kyat ")){
           result = Float.toString(mdgToMYM(Float.valueOf(amountTex.getText())));
           resultshowLab.setText(result + toCom.getSelectedItem());
           rateshowLab.setText(amountTex.getText() + fromCom.getSelectedItem() + " * " + String.valueOf(MDG_RATE) + " / " + String.valueOf(MYM_RATE) + " = " + resultshowLab.getText());
       }
        
    }//GEN-LAST:event_convertButActionPerformed

    private void editButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButActionPerformed
        
        ep.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_editButActionPerformed

    private void resetButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButActionPerformed
        amountTex.setText("");
        rateshowLab.setText("-----------------------------------------------------------------------");
        resultshowLab.setText("...");
    }//GEN-LAST:event_resetButActionPerformed

    private void setButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setButActionPerformed
        // TODO add your handling code here:
        if(fromCom.getSelectedItem().equals("Please Select")){
            toCom.removeAllItems();        
        }
        else if(fromCom.getSelectedItem().equals(" US, Dollar ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" KY, KES "); 
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" KR, Won ")){
            toCom.removeAllItems();
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES "); 
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" KY, KES ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" GB, GBP ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona "); 
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" EUR, Euro ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona ");   
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" CN, Yuan ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona ");    
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" JP, Yen ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona ");    
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" IDN, Rupiah ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" CH, Franc ");
            toCom.addItem(" SE, Krona "); 
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" CH, Franc ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" SE, Krona ");  
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" SE, Krona ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc "); 
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" GH, Cedi ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" GAM, Dalasi ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" NG, Naira ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" NP, Rupee ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" NI, Cordoba ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" LAO, Kip ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" ROM, Leu ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" MOZ, Metical ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MYM, Kyat ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" MYM, Kyat ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MG, Ariary ");
        }
        else if(fromCom.getSelectedItem().equals(" MG, Ariary ")){
            toCom.removeAllItems();
            toCom.addItem(" KR, Won ");
            toCom.addItem(" US, Dollar ");
            toCom.addItem(" KY, KES ");
            toCom.addItem(" GB, GBP ");
            toCom.addItem(" EUR, Euro ");
            toCom.addItem(" CN, Yuan ");
            toCom.addItem(" JP, Yen ");
            toCom.addItem(" IDN, Rupiah ");
            toCom.addItem(" CH, Franc ");    
            toCom.addItem(" SE, Krona ");
            toCom.addItem(" GH, Cedi ");
            toCom.addItem(" GAM, Dalasi ");
            toCom.addItem(" NG, Naira ");
            toCom.addItem(" NP, Rupee ");
            toCom.addItem(" NI, Cordoba ");
            toCom.addItem(" LAO, Kip ");
            toCom.addItem(" ROM, Leu ");
            toCom.addItem(" MOZ, Metical ");
            toCom.addItem(" MYM, Kyat ");
        }
    }//GEN-LAST:event_setButActionPerformed
                                      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MonForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLab;
    private javax.swing.JTextField amountTex;
    private javax.swing.JButton convertBut;
    private javax.swing.JButton editBut;
    private javax.swing.JComboBox<String> fromCom;
    private javax.swing.JLabel fromLab;
    private javax.swing.JLabel nameLab;
    private javax.swing.JLabel rateLab;
    private javax.swing.JLabel rateshowLab;
    private javax.swing.JButton resetBut;
    private javax.swing.JLabel resultLab;
    private javax.swing.JLabel resultshowLab;
    private javax.swing.JButton setBut;
    private javax.swing.JComboBox<String> toCom;
    private javax.swing.JLabel toLab;
    // End of variables declaration//GEN-END:variables

}
