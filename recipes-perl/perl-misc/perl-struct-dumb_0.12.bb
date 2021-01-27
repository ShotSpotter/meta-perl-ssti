SUMMARY = "Struct::Dumb - make simple lightweight record-like structures"
DESCRIPTION = "Struct::Dumb - make simple lightweight record-like structures"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

HOMEPAGE = "https://metacpan.org/pod/Struct::Dumb"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"

LIC_FILES_CHKSUM = "file://LICENSE;md5=4fa536c61510757c30abad389b43a514"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Struct-Dumb-${PV}.tar.gz \
	file://0001-switch-to-makefile-format.patch \
"

SRC_URI[md5sum] = "b17df247f2e42c0b80a8b11b9fc3d824"
SRC_URI[sha256sum] = "52ce70c433e6962ad1c20e9e297a5391e0b74a44520fbce2e482f544e3657f73"

S = "${WORKDIR}/Struct-Dumb-${PV}"

inherit cpan
