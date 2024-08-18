package org.anime_game_servers.multi_proto.gi.data.scene.entity

import org.anime_game_servers.core.base.Version.GI_2_1_0
import org.anime_game_servers.core.base.annotations.AddedIn
import org.anime_game_servers.core.base.annotations.proto.AltName
import org.anime_game_servers.core.base.annotations.proto.ProtoEnum

@AddedIn(GI_2_1_0)
@ProtoEnum
internal enum class ChangeEnergyReason {
    @AltName("CHANGE_ENERGY_REASON_NONE")
    CHANGE_ENERGY_NONE,
    @AltName("CHANGE_ENERGY_REASON_SKILL_START")
    CHANGE_ENERGY_SKILL_START,
}