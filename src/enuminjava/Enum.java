/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enuminjava;

/**
 *
 * @author ADMIN
 */
public class Enum {
    enum PageInfo {
        // define enum with 3 variable
        PAGE_001("PAGE_001", "Login", "/login"), 
        PAGE_002("PAGE_002", "Add new user", "/addUser"), 
        PAGE_003("PAGE_003", "List user", "/listUser");

        private String pageID;
        private String pageTitle;
        private String pageURL;

        /**
         * constructor
         * 
         * @param pageID
         * @param pageTitle
         * @param pageURL
         */
        private PageInfo(String pageID, String pageTitle, String pageURL) {
            this.pageID = pageID;
            this.pageTitle = pageTitle;
            this.pageURL = pageURL;
        }

        // getter & setter
        public String getPageID() {
            return pageID;
        }

        public void setPageID(String pageID) {
            this.pageID = pageID;
        }

        public String getPageTitle() {
            return pageTitle;
        }

        public void setPageTitle(String pageTitle) {
            this.pageTitle = pageTitle;
        }

        public String getPageURL() {
            return pageURL;
        }

        public void setPageURL(String pageURL) {
            this.pageURL = pageURL;
        }
    }    
    public static void main(String[] args) {
        System.out.println("pageID: " + PageInfo.PAGE_001.getPageID());
        System.out.println("pageTitle: " + PageInfo.PAGE_001.getPageTitle());
        System.out.println("pageURL: " + PageInfo.PAGE_001.getPageURL());        
    }
}
