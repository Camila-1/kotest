package io.kotlintest.runner.junit5

import org.junit.platform.engine.EngineDiscoveryRequest
import org.junit.platform.engine.discovery.ClassNameFilter
import org.junit.platform.engine.discovery.ClassSelector
import org.junit.platform.engine.discovery.ClasspathResourceSelector
import org.junit.platform.engine.discovery.ClasspathRootSelector
import org.junit.platform.engine.discovery.DirectorySelector
import org.junit.platform.engine.discovery.FileSelector
import org.junit.platform.engine.discovery.MethodSelector
import org.junit.platform.engine.discovery.ModuleSelector
import org.junit.platform.engine.discovery.PackageNameFilter
import org.junit.platform.engine.discovery.PackageSelector
import org.junit.platform.engine.discovery.UniqueIdSelector
import org.junit.platform.engine.discovery.UriSelector
import org.junit.platform.launcher.LauncherDiscoveryRequest

fun EngineDiscoveryRequest.string() =
    "classpathRootSelectors=${this.getSelectorsByType(ClasspathRootSelector::class.java)}\n" +
        "classpathResourceSelectors=${this.getSelectorsByType(ClasspathResourceSelector::class.java)}\n" +
        "classSelectors=${this.getSelectorsByType(ClassSelector::class.java).map { it.className }}\n" +
        "methodSelectors=${this.getSelectorsByType(MethodSelector::class.java)}\n" +
        "directorySelectors=${this.getSelectorsByType(DirectorySelector::class.java)}\n" +
        "fileSelectors=${this.getSelectorsByType(FileSelector::class.java)}\n" +
        "moduleSelectors=${this.getSelectorsByType(ModuleSelector::class.java)}\n" +
        "packageSelectors=${this.getSelectorsByType(PackageSelector::class.java)}\n" +
        "uniqueIdSelectors=${this.getSelectorsByType(UniqueIdSelector::class.java)}\n" +
        "uriSelectors=${this.getSelectorsByType(UriSelector::class.java)}\n" +
        "classnameFilters=${this.getFiltersByType(ClassNameFilter::class.java)}\n" +
        "packageNameFilters=${this.getFiltersByType(PackageNameFilter::class.java)}"

fun LauncherDiscoveryRequest.string() =
    "classpathRootSelectors=${this.getSelectorsByType(ClasspathRootSelector::class.java)}\n" +
        "classpathResourceSelectors=${this.getSelectorsByType(ClasspathResourceSelector::class.java)}\n" +
        "classSelectors=${this.getSelectorsByType(ClassSelector::class.java).map { it.className }}\n" +
        "methodSelectors=${this.getSelectorsByType(MethodSelector::class.java)}\n" +
        "directorySelectors=${this.getSelectorsByType(DirectorySelector::class.java)}\n" +
        "fileSelectors=${this.getSelectorsByType(FileSelector::class.java)}\n" +
        "moduleSelectors=${this.getSelectorsByType(ModuleSelector::class.java)}\n" +
        "packageSelectors=${this.getSelectorsByType(PackageSelector::class.java)}\n" +
        "uniqueIdSelectors=${this.getSelectorsByType(UniqueIdSelector::class.java)}\n" +
        "uriSelectors=${this.getSelectorsByType(UriSelector::class.java)}\n" +
        "classnameFilters=${this.getFiltersByType(ClassNameFilter::class.java)}\n" +
        "packageNameFilters=${this.getFiltersByType(PackageNameFilter::class.java)}\n" +
        "postDiscoveryFilters=${this.postDiscoveryFilters}\n" +
        "engineFilters=${this.engineFilters}"