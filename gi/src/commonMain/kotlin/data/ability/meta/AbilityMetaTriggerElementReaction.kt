package data.ability.meta

import org.anime_game_servers.core.base.Version.GI_1_6_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.ProtoModel

@AddedIn(GI_1_6_0)
@ProtoModel
internal interface AbilityMetaTriggerElementReaction {
    var elementReactionType: Int
    var elementReactorType: Int
    var elementSourceType: Int
    var hitIndex: Int
    var triggerEntityId: Int
}
