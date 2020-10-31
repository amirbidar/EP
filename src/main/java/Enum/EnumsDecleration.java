package Enum;

public class EnumsDecleration {

    public enum Direction{
      rtl,
      ltr,
      auto
    }

    public enum EventTypeTextField{
        ON_EDIT,
        ON_LOAD,
        ON_CHANGE,
        ON_SELECT,
        ON_DESELECT,
        ON_FOCUS_LOST
    }
    public enum EventPhase{
       after_update_model,
        before_update_model
    }
    public enum Environment{
        server,
        client
    }
    public enum NumberValidatorEnvironment {
        server,
        client,
        client_and_server
    }
    public enum Language{
        inherit,
        javascript,
        skippy
    }

    public enum EventTypeLabel{
        ON_LOAD,
        ON_FOCUS_LOST
    }
    public  enum EventPopUp{
        ON_WINDOW_CLOSE
    }
    public enum DatePickerMode{
      DATE,
      TIME,
      DATE_AND_TIME
    }
    public enum DatePickerCalenderMode{
        jalali,
        gregorian,
        jalali_and_gregorian

    }

    public enum TableSelectionMode{
        single,
        multiple
    }


    public enum EventTypeTable{
        on_load,
        on_double_click,
        on_sort,
        on_next,
        on_previous,
        on_refresh,
        on_first,
        on_last,
        on_row_action,
        on_click,
        on_focus_lost
    }

    public enum ColumnAlignment{
        begin,
        center,
        fill,
        end
    }
    public enum ColumnType{
        STRING,
        DATE,
        TIME,
        DATE_AND_TIME,
        BOOLEAN,
        NUMBER,
        ACTION,
        DOWNLOAD,
        HTML
    }
    public enum ButtonAction{
        NONE,
        CLEAR,
        CLOSE
    }
    public enum EventTypeButton{
        ON_EDIT,ON_LOAD,
        ON_CLICK,
        ON_FOCUS_LOST
    }
    public enum EventTextArea{
        ON_EDIT,
        ON_LOAD,
        ON_CHANGE,
        ON_SELECT,
        ON_DESELECT,
        ON_FOCUS_LOST
    }
    public enum EventLookUp{
        ON_LOAD,
        ON_DOUBLE_CLICK,
        ON_SELECT,
        ON_DESELECT,
        ON_SORT,
        ON_NEXT,
        ON_PREVIOUS,
        ON_REFRESH,
        ON_FIRST,
        ON_LAST,
        ON_SEARCH,
        ON_SELECTION_CHANGE,
        ON_FOCUS_LOST
    }
    public enum EventEditableTable{
        ON_CLICK,
        ON_LOAD,
        ON_SELECTION_CHANGE ,
        ON_ROW_ACTION,
        ON_FOCUS_LOST,
        ON_DOUBLE_CLICK
    }
    public enum SourceUpload{
        FILE,
        SAMAN_SCANNER
    }
    public enum RepositoryTypeUpload{
        ACR,
        ALFRESCO,
        WEB_SERVICE
    }
    public enum TargetLink{
        New_Window,
        Same_Window
    }
    public enum EventLink{
        ON_CLICK,
        ON_LOAD,
        ON_FOCUS_LOST
    }
    public enum EventTypeTree{
        ON_LOAD,
        ON_DOUBLE_CLICK,
        ON_CLICK,
        ON_SELECTION_CHANGE,
        ON_FOCUS_LOST
    }
    public enum CurrencyEvent{
        ON_EDIT,
        ON_LOAD,
        ON_CHANGE,
        ON_SELECT,
        ON_DESELECT,
        ON_FOCUS_LOST

    }
    public enum StaticComboboxEvent {
        on_load,
        on_selection_change,
        on_focus_lost
    }
    public enum DynamicComboboxEvent{
        ON_LOAD,
        ON_SELECT,
        ON_SELECTION_CHANGE,
        ON_DESELECT
    }
    public enum RadioItemEvent{
        ON_SELECT
        ,ON_LOAD,
        ON_SELECTION_CHANGE,
        ON_DESELECT,
        ON_FOCUS_LOST
    }
    public enum ListenerAction{
        BEFORE_UPDATE_MODEL,
        AFTER_UPDATE_MODEL,
        BEFORE_FIRST_RENDER,
        BEFORE_RENDER
    }
    public enum eventType{
        ON_LOAD
    }
    public enum EventDynamicWidget {
        ON_FOCUS_LOST
    }
    public enum TableEventType{
        ON_LOAD,ON_FIRST,ON_LAST,
        ON_NEXT,ON_PREVIOUS,
        ON_REFRESH
    }
    public enum ListenerPhaseAction{
        before_update_model,
        after_update_model,
        before_first_render,
        before_render
    }
    public  enum LookUpEventType{
        ON_LOAD,
        ON_DOUBLE_CLICK,
        ON_SELECT,
        ON_DESELECT,
        ON_SORT,
        ON_NEXT,
        ON_PREVIOUS,
        ON_REFRESH,
        ON_FIRST,
        ON_LAST,
        ON_SEARCH,
        ON_SELECTION_CHANGE,
        ON_FOCUS_LOST

    }
    public  enum DatePickerEventType{
        on_load,
        on_select,
        on_focus_lost
    }














































}