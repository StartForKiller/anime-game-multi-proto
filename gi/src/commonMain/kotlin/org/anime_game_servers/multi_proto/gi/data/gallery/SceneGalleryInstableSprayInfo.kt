package org.anime_game_servers.multi_proto.gi.data.gallery

import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.Version
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(Version.GI_3_0_0)
@ProtoModel(alternativeNames = ["SceneGalleryInstaleSprayInfo"])
internal interface SceneGalleryInstableSprayInfo {
    var score: Int
    var buffInfoList: List<SceneGalleryInstableSprayBuffInfo>
}