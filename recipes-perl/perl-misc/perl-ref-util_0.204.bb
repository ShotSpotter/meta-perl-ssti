SUMMARY = "Ref::Util - Utility functions for checking references"
DESCRIPTION = "Ref::Util - Utility functions for checking references"

HOMEPAGE = "https://metacpan.org/pod/Ref::Util"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=a00f74297f5369a9eed3383dcd4b6984"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AR/ARC/Ref-Util-${PV}.tar.gz \
"

SRC_URI[md5sum] = "add072ed1e481dc43ad6bb8bbe36ab99"
SRC_URI[sha256sum] = "415fa73dbacf44f3d5d79c14888cc994562720ab468e6f71f91cd1f769f105e1"

S = "${WORKDIR}/Ref-Util-${PV}"

inherit cpan
