/*
package com.assetco.hotspots.optimization;

import com.assetco.search.results.Asset;
import com.assetco.search.results.AssetVendor;
import com.assetco.search.results.AssetVendorRelationshipLevel;
import com.assetco.search.results.HotspotKey;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BugsTest {

    @Test
    void precedingPartnerWithLongTrailingAssetsDoesNotWin() {
        // first precondition
        // : you need a partner-level vendor
        AssetVendor partnerVendor = AssetVendor.makeVendor(AssetVendorRelationshipLevel.Partner);

        // express the precondition of having a missing asset
        Asset missing = Asset.givenAssetInResultsWithVendor(partnerVendor);

        // express the precondition of having a disrupting asset
        // from another partner-level vendor
        AssetVendor anotherAssetVendor = AssetVendor.makeVendor(AssetVendorRelationshipLevel.Partner);

        // express the precondition of having sufficient consecutive items
        // with partnerVendor to trigger the showcase but not enough to fill it,
        // and that records the result
        List<Asset> expected = Asset.givenAssetInResultsWithVendorAsList(anotherAssetVendor, 4);

        // write code that expresses the event that triggers the bug : searching
        whenOptimize();

        // write a code that expresses the post-condition of the first asset not being included in the search results
        thenHotspotDoesNotHave(HotspotKey.Showcase, missing);

        // write code that expresses the post-condition of the assets that do make it through.
        thenHotspotHasExactly(HotspotKey.Showcase, expected);
    }

    private void whenOptimize(){

    }

    private void thenHotspotDoesNotHave(HotspotKey hotspotKey, Asset ... assets) {

    }

    private void thenHotspotHasExactly(HotspotKey hotspotKey, List<Asset> expected) {

    }
}
*/
