package com.entagen.jenkins

class BranchView {
    String templateJobPrefix
    String branchName

    public String getSafePrefix() {
        return templateJobPrefix.replace('.','').replace('*','')
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
