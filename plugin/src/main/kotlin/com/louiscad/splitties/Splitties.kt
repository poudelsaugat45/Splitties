package com.louiscad.splitties

object Splitties {
    val pack = Packs

    private const val artifactPrefix = "com.louiscad.splitties:splitties"
    private const val version = "3.0.0-dev-034"

    object Packs {
        const val androidBase = "$artifactPrefix-fun-pack-android-base:$version"
        const val androidBaseWithViewsDsl = "$artifactPrefix-fun-pack-android-base-with-views-dsl:$version"
        const val appCompat = "$artifactPrefix-fun-pack-android-appcompat:$version"
        const val appCompatWithViewsDsl = "$artifactPrefix-fun-pack-android-appcompat-with-views-dsl:$version"
        const val androidMdc = "$artifactPrefix-fun-pack-android-material-components:$version"
        const val androidMdcWithViewsDsl = "$artifactPrefix-fun-pack-android-material-components-with-views-dsl:$version"
    }

    const val activities = "$artifactPrefix-activities:$version"
    const val alertdialog = "$artifactPrefix-alertdialog:$version"
    const val alertdialogAppcompat = "$artifactPrefix-alertdialog-appcompat:$version"
    const val alertdialogAppcompatCoroutines = "$artifactPrefix-alertdialog-appcompat-coroutines:$version"
    const val appctx = "$artifactPrefix-appctx:$version"
    const val archLifecycle = "$artifactPrefix-arch-lifecycle:$version"
    const val archRoom = "$artifactPrefix-arch-room:$version"
    const val bitflags = "$artifactPrefix-bitflags:$version"
    const val bundle = "$artifactPrefix-bundle:$version"
    const val checkedlazy = "$artifactPrefix-checkedlazy:$version"
    const val collections = "$artifactPrefix-collections:$version"
    const val dimensions = "$artifactPrefix-dimensions:$version"
    const val exceptions = "$artifactPrefix-exceptions:$version"
    const val fragments = "$artifactPrefix-fragments:$version"
    const val fragmentargs = "$artifactPrefix-fragmentargs:$version"
    const val initprovider = "$artifactPrefix-initprovider:$version"
    const val intents = "$artifactPrefix-intents:$version"
    const val lifecycleCoroutines = "$artifactPrefix-lifecycle-coroutines:$version"
    const val mainhandler = "$artifactPrefix-mainhandler:$version"
    const val mainthread = "$artifactPrefix-mainthread:$version"
    const val materialColors = "$artifactPrefix-material-colors:$version"
    const val materialLists = "$artifactPrefix-material-lists:$version"
    const val permissions = "$artifactPrefix-permissions:$version"
    const val preferences = "$artifactPrefix-preferences:$version"
    const val resources = "$artifactPrefix-resources:$version"
    const val snackbar = "$artifactPrefix-snackbar:$version"
    const val stethoInit = "$artifactPrefix-stetho-init:$version"
    const val systemservices = "$artifactPrefix-systemservices:$version"
    const val toast = "$artifactPrefix-toast:$version"
    const val typesaferecyclerview = "$artifactPrefix-typesaferecyclerview:$version"
    const val views = "$artifactPrefix-views:$version"
    const val viewsAppcompat = "$artifactPrefix-views-appcompat:$version"
    const val viewsCardview = "$artifactPrefix-views-cardview:$version"
    const val viewsCoroutines = "$artifactPrefix-views-coroutines:$version"
    const val viewsCoroutinesMaterial = "$artifactPrefix-views-coroutines-material:$version"
    const val viewsDsl = "$artifactPrefix-views-dsl:$version"
    const val viewsDslAppcompat = "$artifactPrefix-views-dsl-appcompat:$version"
    const val viewsDslConstraintlayout = "$artifactPrefix-views-dsl-constraintlayout:$version"
    const val viewsDslCoordinatorlayout = "$artifactPrefix-views-dsl-coordinatorlayout:$version"
    const val viewsDslIdePreview = "$artifactPrefix-views-dsl-ide-preview:$version"
    const val viewsDslMaterial = "$artifactPrefix-views-dsl-material:$version"
    const val viewsDslRecyclerview = "$artifactPrefix-views-dsl-recyclerview:$version"
    const val viewsMaterial = "$artifactPrefix-views-material:$version"
    const val viewsRecyclerview = "$artifactPrefix-views-recyclerview:$version"
    const val viewsSelectable = "$artifactPrefix-views-selectable:$version"
    const val viewsSelectableAppcompat = "$artifactPrefix-views-selectable-appcompat:$version"
    const val viewsSelectableConstraintlayout = "$artifactPrefix-views-selectable-constraintlayout:$version"

}
