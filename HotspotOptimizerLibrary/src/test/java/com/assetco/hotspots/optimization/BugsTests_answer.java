package com.assetco.hotspots.optimization;

import com.assetco.search.results.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static com.assetco.search.results.AssetVendorRelationshipLevel.*;
import static com.assetco.search.results.HotspotKey.*;

// The first step is just a description of the problem this test doesn't do anything
// at all. It just calls methods with descriptive names.
public class BugsTests_answer {
    // Mark the method as a test so it will be executed by the test runner
    @Test
    public void precedingPartnerWithLongTrailingAssetsDoesNotWin() {
      final var partnerVendor = makeVendor(Partner);
      final int maximumShowcaseItems = 5;
      // I don't need to track this, yet, but I like my tests to be very explanatory
        var missing =
          // We'll need an asset from a different partner-level vendor
          givenAssetInResultsWithVendor(partnerVendor);
        // This is the "salt" that makes the system work differently from how business expected
        givenAssetInResultsWithVendor(makeVendor(Partner));
        // This is what is actually put in the showcase box
        var expected = givenAssetsInResultsWithVendor(maximumShowcaseItems - 1, partnerVendor);

        whenOptimize();

        thenHotspotDoesNotHave(Showcase, missing);
        thenHotspotHasExactly(Showcase, expected);
    }

    // **************************************************
    // * These methods help organize the test to come   *
    // **************************************************
    private AssetVendor makeVendor(AssetVendorRelationshipLevel relationshipLevel) {
      return null;
    }

    private Asset givenAssetInResultsWithVendor(AssetVendor vendor) {
        return null;
    }

    private Asset getAsset(AssetVendor vendor) {
      return null;
    }

    private AssetPurchaseInfo getPurchaseInfo() {
      return null;
    }

    private void thenHotspotHasExactly(HotspotKey hotspotKey, List<Asset> expected) {
    }

    private ArrayList<Asset> givenAssetsInResultsWithVendor(int count, AssetVendor vendor) {
        var result = new ArrayList<Asset>();
        for (var i = 0; i < count; ++i) {
            result.add(givenAssetInResultsWithVendor(vendor));
        }
        return result;
    }

    private void whenOptimize() {
    }

    private void thenHotspotDoesNotHave(HotspotKey key, Asset... forbidden) {
    }
}