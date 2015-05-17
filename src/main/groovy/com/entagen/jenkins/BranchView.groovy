package com.entagen.jenkins

class BranchView {
    String templateJobPrefix
    String branchName

    public String getSafePrefix() {
        return templateJobPrefix.replaceAll('.','').replaceAll('*','')
    }

    public String getViewName() {
        return "$safePrefix-$safeBranchName"
    }

    public String getSafeBranchName() {
        return branchName.replaceAll('/', '_')
    }


    public String toString() {
        return this.viewName
    }
}
