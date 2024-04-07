package data.ability.mixin

import org.anime_game_servers.core.base.Version.GI_2_3_0
import org.anime_game_servers.core.base.Version.GI_CB1
import org.anime_game_servers.core.base.Version.GI_CB2
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_CB1)
@ProtoModel
internal interface AbilityMixinElementShield {
    var isShieldBroken: Boolean
    var maxShield: Float
    var shield: Float
    var subShield: Float
    @AddedIn(GI_CB2)
    var absorbType: Int
    @AddedIn(GI_2_3_0)
    var playerNum: Int
}
