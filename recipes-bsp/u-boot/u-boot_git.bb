require u-boot.inc

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://Licenses/gpl-2.0.txt;md5=b234ee4d69f5fce4486a80fdaf4a4263"

# No patches for other machines yet
COMPATIBLE_MACHINE = "(mele|meleg|olinuxino-a13|olinuxino-a10s|olinuxino-a10|olinuxino-a20|olinuxino-a20som|olinuxino-a20lime|cubieboard|cubieboard2|cubietruck|bananapi)"

DEFAULT_PREFERENCE_mele= "1"
DEFAULT_PREFERENCE_meleg= "1"
DEFAULT_PREFERENCE_olinuxino-a13= "1"
DEFAULT_PREFERENCE_olinuxino-a10s= "1"
DEFAULT_PREFERENCE_olinuxino-a10= "1"
DEFAULT_PREFERENCE_olinuxino-a20= "1"
DEFAULT_PREFERENCE_olinuxino-a20som= "1"
DEFAULT_PREFERENCE_olinuxino-a20lime= "1"
DEFAULT_PREFERENCE_cubieboard="1"
DEFAULT_PREFERENCE_cubieboard2="1"
DEFAULT_PREFERENCE_cubietruck="1"
DEFAULT_PREFERENCE_bananapi="1"

SRC_URI += "git://github.com/linux-sunxi/u-boot-sunxi.git;protocol=git;branch=sunxi "

PE = "1"
PV = "v2014.04+git${SRCPV}"
SRCREV = "ee425f94b488a4304c136a171bb8fdec0d835032"


S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

SPL_BINARY="u-boot-sunxi-with-spl.bin"

